package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
  * :: NOTES ::
  * -- When naming the controller <name of service>Controller
  * -- create controllers that describes the routes  
  */

@Singleton
class HomeController @Inject()
(val controllerComponents: ControllerComponents)
extends BaseController {

  def index() = Action { implicit request =>
    Ok("I'm in!")
  }

  // get all 
  def get = TODO

  // get by id
  def find = TODO

  // create or add to list
  def create = TODO

  // update as PUT 
  def update = TODO

  //update as PATCH
  def edit = TODO

  // delete the item
  def delete = TODO

}
