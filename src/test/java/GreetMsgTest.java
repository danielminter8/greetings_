import exceptions.GreetException;
import org.junit.jupiter.api.Test;
import services.Greet;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GreetMsgTest extends DbConnection{

    @Test
    public void shouldGreetUserInEnglish() throws GreetException {
        Greet greet = new Greet();
        assertEquals("Hello Daniel",greet.GreetUser("daniel", "english"),"Should greet Daniel in english.");
    }

    @Test
    public void shouldGreetUserInAfrikaans() throws GreetException {
        Greet greet = new Greet();
        assertEquals("More Jim",greet.GreetUser("jim", "afrikaans"),"Should greet Jim in afrikaans.");
    }

    @Test
    public void shouldGreetUserInXhosa() throws GreetException {
        Greet greet = new Greet();
        assertEquals("Molo Belinda",greet.GreetUser("belinda", "xhosa"),"Should greet Belinda in xhosa.");
    }

//    @Test
//    public void shouldTellUserToChooseLanguage() throws GreetException {
//        //if user doesn't enter language should greet user in english by default
//        Greet greet = new Greet();
//        assertEquals("Hello Belinda",greet.GreetUser("belinda", ""),"Please choose a language.");
//    }

}
