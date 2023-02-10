package morsePackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseTest {

    @Test
    public void TestHasMap(){
        MorseLogic test = new MorseLogic();
        test.setInputEng("ABC");
        String actual = test.getresult();
        String expected = "*--***-*-*";
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void TestHasMap2(){
        MorseLogic test = new MorseLogic();
        test.setInputEng("*--***-*-*");
        String actual = test.getresult();
        String expected = "ABC";
        Assertions.assertEquals(expected, actual);


    }
}
