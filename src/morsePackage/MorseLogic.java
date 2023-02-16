package morsePackage;

import java.util.HashMap;
import java.util.Scanner;

public class MorseLogic {
    private String input;
    private HashMap<String, String> MorseInfo;
    private String output = "";
    private String[] result;

    public MorseLogic() {

        MorseInfo = new HashMap<>();
        String[] Letter = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "?"};
        String[] Morse = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "**--**"};

        for (int i = 0; i < Letter.length; i++) {
            MorseInfo.put(Letter[i], Morse[i]);
            MorseInfo.put(Morse[i], Letter[i]);
        }
    }

    public void setInputEng(String input) {
        output = "";
        if (input.contains("*") || input.contains("-")) { // felhantering
            System.out.println("seems like your trying to write in morse, please write in English.");
        } else {
            this.input = input.toUpperCase();

            compare();
        }
    }

    public void compare() {
        input = input.replaceAll("\\s+", "");


        result = input.split("");
        for (String i : result) {

            output += " " + MorseInfo.get(i);

        }
        getresult();
    }

    public String getresult() {
        return output;
    }

    public void setInputMorse(String input) {
        output = "";
        if (input.contains("*") || input.contains("-")) { // felhantering
            this.input = input.toUpperCase();

            compare2();
        } else {
            System.out.println("seems like your trying to write in english, please write in morse and use \"*\" or \"-\"");
        }
    }


    private void compare2() {
        result = input.split(" ");
        for (String i : result) {

            output += MorseInfo.get(i);

        }
        getresult();
    }


}
