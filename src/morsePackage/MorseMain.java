package morsePackage;

import java.util.Scanner;

public class MorseMain {
    public static void main(String[] args) {
        MorseLogic test = new MorseLogic();
        Scanner scan = new Scanner(System.in);

        test.setInputEng(scan.nextLine());
        System.out.println(test.getresult());

    }
}
