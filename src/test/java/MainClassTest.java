import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class MainClassTest {
    MainClass mc = new MainClass();


    @Test
    void testGetLocalNumber(){
        Assertions.assertEquals(15,mc.getLocalNumber(),"Numbers are different");
    }

    @Test
    void testGetClassNumber(){
        Assertions.assertTrue(mc.getClassNumber()>45,"Number is <= 45");
    }

    @Test
    void testGetClassString(){

        Assertions.assertTrue(mc.getClassString().toLowerCase().contains("hello"),
                "Text does not contain hello or Hello");

    }
}
