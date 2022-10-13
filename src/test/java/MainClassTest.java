import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    MainClass mc = new MainClass();


    @Test
    void testGetLocalNumber(){
        Assertions.assertEquals(15,mc.getLocalNumber(),"Numbers are different");
    }
}
