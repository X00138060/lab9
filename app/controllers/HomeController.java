package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

import views.html.*;

public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    public Result index() {
        List<Product> p = Product.findAll();
        return ok(index.render(p));
    }

    public Result addProduct() {
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm));
    }

    public Result addProductSubmit() {
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm));
        } else {
            Product newProduct = newProductForm.get();
            if (newProduct.getId() == null) {
                newProduct.save();
            } else {
                newProduct.update();
            }
            
            flash("success", "Product " + newProduct.getName() + " was added/updated");
            return redirect(controllers.routes.HomeController.index());
        }
    }

    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();
        flash("sucess", "Product Deleted");
        return redirect(routes.HomeController.index());
    }

    @Transactional
    public Result updateProduct(Long id) {
        Product p;
        Form<Product> productForm;

        try {
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addProduct.render(productForm));
    }

}
