package controllers;

import play.mvc.Controller;
import play.mvc.Result;

//BRONZE

//SILVER

//GOLD
//TODO Make the western route have a "Meeting with Santa" page that
//TODO   the player has a 50% chance of seeing
//TODO On each screen show the list of able bodied crew and announce
//TODO   the name of the injured crew person
//TODO Consolidate the end game pages into a single page to reduce duplicate code
//TODO Add an Easter Egg (Google or use search engine of your choice for "Easter Egg Game"
//TODO   if an explanation is needed)

//PLATINUM
//TODO On the welcome screen allow the user to pick one of four pictures of a kitten
//TODO   to represent themselves.  Show this image on each screen of the game.
//TODO Implement a 20% chance that the fidget spinners are covered in lead paint
//TODO   When this happens the Queen should throw the player in prison

public class GameController extends Controller
{
    public Result getWelcome()
    {
        return ok(views.html.welcome.render());
    }

    public Result postStart()
    {
        return ok(views.html.start.render());
    }

    public Result postEastFromEngland()
    {
        return ok(views.html.eastfromengland.render());
    }

    public Result postNorthFromEngland()
    {
        return ok(views.html.northfromengland.render());
    }

    public Result postWestFromEngland()
    {
        return ok(views.html.westfromengland.render());
    }

    public Result postEastEnd()
    {
        return ok(views.html.eastend.render());
    }

    public Result postWestEnd()
    {
        return ok(views.html.westend.render());
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
