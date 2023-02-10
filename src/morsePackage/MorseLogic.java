package morsePackage;

import java.util.HashMap;
import java.util.Scanner;

public class MorseLogic {
    private String input;
    private HashMap<String, String> MorseInfo;
    private String output;
    private String [] result;

    public MorseLogic() {

        MorseInfo = new HashMap<>();
        String[] Letter = {"A", "B", "C", "D", "E","F","G","H","I","J","K","L","M"};
        String[] Morse = {"*-", "-***", "-*-*", "-**", "*","**-*","--*","****","**","*---","-*-","*-**","--"};

        for (int i = 0; i < Letter.length; i++) {
            MorseInfo.put(Letter[i], Morse[i]);
            MorseInfo.put(Morse[i], Letter[i]);
        }
    }
    public void setInputEng(String input) {
        this.input = input;
       compare();


    }
    public void compare() {

        result = input.split("");
        for (String i : result) {

            output+=MorseInfo.get(i);

        }
        getresult();
    }
    public String getresult() {
        return output;
    }
}
