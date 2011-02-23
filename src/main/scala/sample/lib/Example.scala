package sample.lib

import net.liftweb.http.rest.RestHelper
import net.liftweb.http.{SessionVar,OkResponse,PlainTextResponse}

object Example extends RestHelper { 
  serve {
    case "protected" :: Nil Get _ => 
      PlainTextResponse("Ohh, secret")
  }
}

object Security extends RestHelper {
  serve {
    case "login" :: Nil Get _ => 
      LoggedIn(true)
      OkResponse()
  }
}

object LoggedIn extends SessionVar(false)