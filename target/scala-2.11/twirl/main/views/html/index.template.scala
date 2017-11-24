
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.17*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main(title)/*12.13*/ {_display_(Seq[Any](format.raw/*12.15*/("""

  """),format.raw/*14.3*/("""<h1>"""),_display_(/*14.8*/title),format.raw/*14.13*/("""</h1>
  <hr>

  <div id="content"></div>
  <script type='text/javascript' src='"""),_display_(/*18.40*/routes/*18.46*/.Assets.versioned("javascripts/reactTest.js")),format.raw/*18.91*/("""'></script>

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 13:50:28 AEST 2017
                  SOURCE: /home/liam/coding/play/play-scala-starter-example/app/views/index.scala.html
                  HASH: ca95a13359af6530e0cf78f85a1dbd5096845d6b
                  MATRIX: 616->95|726->110|755->306|783->308|803->319|843->321|874->325|905->330|931->335|1038->415|1053->421|1119->466|1163->480
                  LINES: 23->5|28->5|30->11|31->12|31->12|31->12|33->14|33->14|33->14|37->18|37->18|37->18|39->20
                  -- GENERATED --
              */
          