package controllers;

import play.api.mvc.Session;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;



import javax.inject.Inject;

public class GameController extends Controller
{
    private FormFactory formFactory;
    @Inject
    public GameController(FormFactory formFactory)
    {
        this.formFactory=formFactory;
    }
    public Result getWelcome()
    {

        return ok(views.html.welcome.render());
    }

    public Result postStart()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String name = form.get("name");
        session().put("name",name);


        return ok(views.html.start.render());
    }
    public Result getStart()
    {

        return ok(views.html.start.render());
    }

    public Result postEastFromEngland()
    {
        return ok(views.html.eastfromengland.render());
    }

    public Result postNorthFromEngland()
    {
        String name = session().get("name");
        return ok(views.html.northfromengland.render(name));
    }

    public Result postWestFromEngland()
    {
        return ok(views.html.westfromengland.render());
    }
    public Result postBetweenNorthAndStart(){
        return ok(views.html.betweenNorthAndStart.render());
    }

    public Result postEastEnd()
    {
        String name = session().get("name");
        return ok(views.html.eastend.render(name));
    }

    public Result postWestEnd()
    {
        String name = session().get("name");
        return ok(views.html.westend.render(name));
    }

    public Result postHomePort()
    {
        return ok(views.html.homeport.render());
    }

    public Result getKittens()
    {
        return ok(views.html.kittens.render());
    }
}
