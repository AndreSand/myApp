package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Time to go get a Beer...Your new application is ready."))
  }

}