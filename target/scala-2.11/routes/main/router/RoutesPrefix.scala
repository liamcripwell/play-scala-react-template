
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/liam/coding/play/play-scala-react-template/conf/routes
// @DATE:Fri Nov 24 14:02:28 AEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
