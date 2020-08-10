package exceptions;

public class NoNameException extends GreetException {
    private final String message;

    public NoNameException() {
        this.message = "Please enter a name.";
    }

    public String getMessage(){
        return message;
    }

}