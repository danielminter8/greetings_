package services;
import exceptions.GreetException;
import exceptions.NoLanguageException;
import exceptions.NoNameException;
import language.Language;

public class Greet extends Queries {

    String greeting = "";

    public String GreetUser(String name, String lang) throws GreetException {
        if(name.equals("")) throw new NoNameException();
        if(lang.equals("")) throw new NoLanguageException();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase(); // standardization
        name = name.replaceAll("\\s+", "");
        String greetExpression = Language.getExpression(lang);
        addNameToDB(name);
        this.greeting = greetExpression + name;


        return greeting;
    } //greet
}