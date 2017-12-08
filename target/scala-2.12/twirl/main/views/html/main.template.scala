
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>
    <style>
        .id """),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""
            """),format.raw/*14.13*/("""text-align: right;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</style>

<!-- Bootstrap Core CSS -->
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.versioned("javascripts/main.js")),format.raw/*19.61*/(""""></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
<!-- Custom CSS --> <link href=""""),_display_(/*21.34*/routes/*21.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.81*/("""" rel="stylesheet" />

</head>

<body>

<nav class="navbar navbar-inverse">

<div class="container-fluid">

<div class="navbar-header">

<a class="navbar-brand" href="#">Online Shop</a>

</div>

<ul class="nav navbar-nav">

<li class="active"><a href="#">About</a></li>

<li><a href="#">Services</a></li>

<li><a href="#">Contact</a></li>

</ul>

</div>

</nav>

<container>

<row>

<div class="col-md-12">

"""),_display_(/*57.2*/content),format.raw/*57.9*/("""

"""),format.raw/*59.1*/("""</div>

</row>

</container>

<container>

<row>

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</row>

</container>

</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 07 13:52:09 GMT 2017
                  SOURCE: /media/sf_student/lab8/app/views/main.scala.html
                  HASH: ddcd502f6911b12d10a19941bf84891e99b8ebf4
                  MATRIX: 952->1|1077->31|1107->35|1231->132|1257->137|1320->172|1349->173|1391->187|1446->215|1475->216|1508->222|1590->277|1605->283|1666->323|1839->469|1854->475|1916->516|2387->961|2414->968|2445->972
                  LINES: 28->1|33->1|35->3|43->11|43->11|45->13|45->13|46->14|47->15|47->15|48->16|51->19|51->19|51->19|53->21|53->21|53->21|89->57|89->57|91->59
                  -- GENERATED --
              */
          