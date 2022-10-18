import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainClassTest {
    MainClass mc = new MainClass();


    @Test
    void testGetLocalNumber(){
        Assertions.assertEquals(14,mc.getLocalNumber(),"Numbers are different");
    }

    @Test
    void testGetClassNumber(){
        Assertions.assertTrue(mc.getClassNumber()>45,"Number is <= 45");
    }

    @Test
    void testGetClassString(){
        if(mc.getClassString().contains("Hello") || mc.getClassString().contains("hello")){
            Assertions.assertTrue(true);
        }else {
            Assertions.assertTrue(false,"Text does not contain hello or Hello");
        }
    }
}
