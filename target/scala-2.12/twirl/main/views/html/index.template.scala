
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>

  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
    """),format.raw/*8.5*/("""<div class = "alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""</div>
  """)))}),format.raw/*11.4*/("""
  
  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
    <!-- The header row-->
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Stock</th>
        <th>Price</th>
        <th></th>
        <th></th>
      </tr>
    </thead>
    <tbody> 
    <!-- Product row(s) -->
    """),_display_(/*28.6*/for(p<-products) yield /*28.22*/ {_display_(Seq[Any](format.raw/*28.24*/("""
      """),format.raw/*29.7*/("""<tr>
        <td class = "id">"""),_display_(/*30.27*/p/*30.28*/.getId),format.raw/*30.34*/("""</td>
        <td>"""),_display_(/*31.14*/p/*31.15*/.getName),format.raw/*31.23*/("""</td>
        <td>"""),_display_(/*32.14*/p/*32.15*/.getDescription),format.raw/*32.30*/("""</td>
        <td>"""),_display_(/*33.14*/p/*33.15*/.getStock),format.raw/*33.24*/("""</td>
        <td>&euro; """),_display_(/*34.21*/("%,.2f".format(p.getPrice))),format.raw/*34.49*/("""</td>
        <td>
          <a class="btn-xs btn-danger" href=""""),_display_(/*36.47*/routes/*36.53*/.HomeController.updateProduct(p.getId)),format.raw/*36.91*/("""">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>
        <td>
          <a class="btn-xs btn-danger" onlclick="return confirmDel();" href=""""),_display_(/*41.79*/routes/*41.85*/.HomeController.deleteProduct(p.getId)),format.raw/*41.123*/("""">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*46.6*/("""
    """),format.raw/*47.5*/("""</tbody>
  </table>

  <p>
    <a href=""""),_display_(/*51.15*/routes/*51.21*/.HomeController.addProduct()),format.raw/*51.49*/("""">
      <button class="btn btn-primary">Add a Product</button>
    </a>
  </p>
  
  """)))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 13:01:24 GMT 2017
                  SOURCE: /media/sf_student/lab9/app/views/index.scala.html
                  HASH: 556a657ebd01742b00a7f8174597e64367fcd844
                  MATRIX: 962->1|1089->33|1117->36|1146->57|1185->59|1217->65|1284->107|1324->139|1363->141|1394->146|1462->189|1475->194|1510->209|1542->214|1582->224|1615->230|1980->569|2012->585|2052->587|2086->594|2144->625|2154->626|2181->632|2227->651|2237->652|2266->660|2312->679|2322->680|2358->695|2404->714|2414->715|2444->724|2497->750|2546->778|2638->843|2653->849|2712->887|2923->1071|2938->1077|2998->1115|3137->1224|3169->1229|3237->1270|3252->1276|3301->1304
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|68->36|68->36|68->36|73->41|73->41|73->41|78->46|79->47|83->51|83->51|83->51
                  -- GENERATED --
              */
          