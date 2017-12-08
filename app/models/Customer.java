package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

public class Customer extends Model {
    @Id private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private int age;

    public Customer() {
    }

    public Customer(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);
    
    public static final List<Customer> findAll() {
        return Customer.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}