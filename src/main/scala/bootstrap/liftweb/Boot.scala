package bootstrap.liftweb

import net.liftweb.http.{LiftRules,Req}
import net.liftweb.util.Helpers._ 
import sample.lib.{Security,Service,LoggedIn}

class Boot {
  def boot {
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))
    
    val withAuthentication: PartialFunction[Req, Unit] = { 
      case _ if LoggedIn.is => 
    }
    
    LiftRules.dispatch.append(Security)
    LiftRules.dispatch.append(withAuthentication guard Service)
  }
}