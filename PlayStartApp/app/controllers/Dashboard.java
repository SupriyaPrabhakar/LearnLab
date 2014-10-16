package controllers;

import models.User;
import models.Event;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.dashboard.index;

import java.util.List;

/**
 * User: yesnault
 * Date: 22/01/12
 */
@Security.Authenticated(Secured.class)
public class Dashboard extends Controller {

    public static Result index() {
        return ok(index.render((User.findByEmail(request().username())),Event.findEvent()));
        //Event.findEvent());
    }
}
