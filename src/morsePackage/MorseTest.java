package morsePackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseTest {

    @Test
    public void TestHasMap(){
        MorseLogic test = new MorseLogic();
        test.setInputEng("ABC");
        String actual = test.getresult();
        String expected = " *- -*** -*-*";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void spaces (){
        MorseLogic test = new MorseLogic();
        test.setInputEng("Hello how are you?");
        String actual = test.getresult();
        String expected = " **** * *-** *-** --- **** --- *-- *- *-* * -*-- --- **- **--**";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Test3(){
        MorseLogic test = new MorseLogic();
        test.setInputMorse("*-");
        String actual = test.getresult();
        String expected = "A";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestHasMap2(){
        MorseLogic test = new MorseLogic();
        test.setInputMorse("*- -*** -*-*");
        String actual = test.getresult();
        String expected = "ABC";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void WrongInput(){
        MorseLogic test = new MorseLogic();
        test.setInputMorse("abc");
        String actual = test.getresult();
        String expected = "";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void WrongInput2(){
        MorseLogic test = new MorseLogic();
        test.setInputMorse("*");
        String actual = test.getresult();
        String expected = "E";
        Assertions.assertEquals(expected, actual);
    }


}
