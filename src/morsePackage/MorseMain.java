package morsePackage;

import java.util.Scanner;

public class MorseMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseLogic translator = new MorseLogic();
        while (true) {
            System.out.println("Morsetranslator \nif your want to translate a word from english to morse write \"Morse\"" +
                    "\nif you want to translate a word from morse to english write \"English\"\nIf you want to stop writing write \"Stop\"");
            String option = scan.nextLine();
            switch (option.toUpperCase()) {
                case "MORSE":
                    System.out.println("you choose to translate to Morse, please write something in english");
                    translator.setInputEng(scan.nextLine());
                    System.out.println("Morse:" + translator.getresult());
                    System.out.println();
                    break;
                case "ENGLISH":
                    System.out.println("you choose to translate to English, please write something in Morse");
                    translator.setInputMorse(scan.nextLine());
                    System.out.println("English: " + translator.getresult());
                    System.out.println();
                    break;

                case "STOP":
                    System.out.println("program is stopping...");
                    return;
                case "", " "://felhantering
                    System.out.println("you didnt write anything");
                    break;
                default: //felhantering
                    System.out.println("Something went wrong make sure you to write \"Morse\" or \"English\" ");
                    System.out.println();
                    break;


            }



        }
    }
}
