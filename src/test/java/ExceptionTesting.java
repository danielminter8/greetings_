import exceptions.GreetException;
import org.junit.jupiter.api.Test;
import services.Greet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionTesting {

    /// Testing 'counter' command
    @Test
    public void shouldThrowNoNameException(){
        Greet greet = new Greet();
        try {
            greet.GreetUser("", "english");
        }catch(GreetException es){
            assertEquals("Please enter a name.", es.getMessage());
        }
    }
    @Test
    public void shouldThrowNoLanguageException() throws GreetException {
        Greet greet = new Greet();
        try {
            greet.GreetUser("Daniel", "");
        }catch(GreetException es){
            assertEquals("Please choose a language.", es.getMessage());
        }
    }


}
