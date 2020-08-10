package routes;

import exceptions.GreetException;
import language.Language;
import services.Greet;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class Routes {

    public Routes(){
        Map<String, Object> map = new HashMap<>();
        Greet greet = new Greet();
        get("/", (req, res) -> {
            List supportedLang = Language.getAllLanguages();
            map.put("count", greet.totalUniqueUsersGreeted());
            map.put("users", greet.getAllNamesGreeted());
            map.put("languages", supportedLang);
            return new ModelAndView(map, "index.handlebars");

        }, new HandlebarsTemplateEngine());

        get("/reset", (req, res) -> {
            greet.deleteAllNames();
            map.clear();
            res.redirect("/");
            return null;
        });

        post("/hello", (req, res) -> {
            String name = req.queryParams("username");
            String lang = req.queryParams("lang");
            try {
                String greeting = greet.GreetUser(name, lang);
                map.put("greeting", greeting);
            }catch (GreetException es){
                map.put("greeting", es.getMessage());
            }
            res.redirect("/");
            return null;
        });


    }
    }

