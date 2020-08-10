package exceptions;

public class NoLanguageException extends GreetException {
    private final String message;

    public NoLanguageException() {
        this.message = "Please choose a language.";
    }

    public String getMessage(){
        return message;
    }

}
