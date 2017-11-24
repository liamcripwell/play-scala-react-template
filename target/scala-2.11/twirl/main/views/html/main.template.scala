
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
      <script type='text/javascript' src='"""),_display_(/*12.44*/routes/*12.50*/.WebJarAssets.at(WebJarAssets.fullPath("react", "react.js"))),format.raw/*12.110*/("""'></script>

      <!-- Bootstrap stuff -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        """),format.raw/*20.62*/("""
        """),format.raw/*21.9*/("""<title>"""),_display_(/*21.17*/title),format.raw/*21.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*22.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*23.59*/routes/*23.65*/.Assets.versioned("images/favicon.png")),format.raw/*23.104*/("""">


    </head>
    <body>
        """),format.raw/*29.32*/("""
        """),_display_(/*30.10*/content),format.raw/*30.17*/("""
    """),format.raw/*31.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 13:40:15 AEST 2017
                  SOURCE: /home/liam/coding/play/play-scala-starter-example/app/views/main.scala.html
                  HASH: 9285a2c2e7f904c944ac936047e7afa207d62c06
                  MATRIX: 784->260|909->290|937->292|1051->379|1066->385|1148->445|1642->964|1678->973|1713->981|1739->986|1828->1048|1843->1054|1906->1095|1994->1156|2009->1162|2070->1201|2134->1327|2171->1337|2199->1344|2231->1349
                  LINES: 25->7|30->7|32->9|35->12|35->12|35->12|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|51->29|52->30|52->30|53->31
                  -- GENERATED --
              */
          