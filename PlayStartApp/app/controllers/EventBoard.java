package controllers;

import models.Event;
import models.Question;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.event.index;
import views.html.event.stage1;
/**
 * Created by Supriya on 14/10/2014.
 */
@Security.Authenticated(Secured.class)
public class EventBoard extends Controller{

        public static Result index() {

            return ok(index.render((User.findByEmail(request().username())), Event.findEvent()));
        }

        public static Result stage1(){
            return ok(stage1.render(User.findByEmail(request().username()),Event.findEvent(),Question.getQuestionByEventId()));
        }
}

