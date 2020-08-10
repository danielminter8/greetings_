package language;


import java.util.ArrayList;
import java.util.List;

public enum Language {
    English("Hello"),
    Afrikaans("More"),
    Xhosa("Molo"),
    French("Bonjour"),
    Russian("Zdravstvuyte"),
    Tanzanian("Hujambo"),
    German("Guten Tag"),
    Spanish("Hola");

    public String lang;
    public static String defaultLang = "Hello";
    Language(String lang) {
        this.lang = lang;
    }

    public static String getExpression(String text) {
        for (Language b : Language.values()) {
            if (b.name().equalsIgnoreCase(text)) {
                return b.lang+" ";
            }
        }
        return defaultLang+" ";
    }

    public static List getAllLanguages(){
        List<String> lang=new ArrayList<String>();
        for (Language b : Language.values()) {
            lang.add(b.name());
        }
        return lang;
    }

}