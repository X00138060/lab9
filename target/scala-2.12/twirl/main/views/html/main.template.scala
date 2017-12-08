
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
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
<!-- Custom CSS --> <link href=""""),_display_(/*20.34*/routes/*20.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*20.81*/("""" rel="stylesheet" />

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

"""),_display_(/*56.2*/content),format.raw/*56.9*/("""

"""),format.raw/*58.1*/("""</div>

</row>

</container>

<container>

<row>

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</row>

</container>
<script src=""""),_display_(/*77.15*/routes/*77.21*/.Assets.versioned("javascripts/main.js")),format.raw/*77.61*/(""""></script>

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
                  DATE: Fri Dec 08 12:47:16 GMT 2017
                  SOURCE: /media/sf_student/lab9/app/views/main.scala.html
                  HASH: d788c9057f8fb9519b79f5585de696b88b032bf5
                  MATRIX: 952->1|1077->31|1105->33|1221->122|1247->127|1308->160|1337->161|1378->174|1432->201|1461->202|1493->207|1690->377|1705->383|1767->424|2202->833|2229->840|2258->842|2443->1000|2458->1006|2519->1046
                  LINES: 28->1|33->1|35->3|43->11|43->11|45->13|45->13|46->14|47->15|47->15|48->16|52->20|52->20|52->20|88->56|88->56|90->58|109->77|109->77|109->77
                  -- GENERATED --
              */
          