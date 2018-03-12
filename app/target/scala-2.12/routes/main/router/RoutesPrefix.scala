// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/albert/Downloads/play-java-starter-example/conf/routes
// @DATE:Fri Mar 09 23:32:32 BRT 2018


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
