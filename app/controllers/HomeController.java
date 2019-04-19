package controllers;

import models.*;
import play.mvc.*;
import play.db.ebean.Transactional;

import java.util.Date;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    public Result hello() {

        return ok(views.html.hello.render());
    }

}
