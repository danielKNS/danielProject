import java.util.Scanner;

public class WordCasingConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your word ? ");

        String userInput = scanner.nextLine();
        //get first letter of the string.
        String firstLetter = userInput.substring(0,1);
        //get the reamaining letters.
        String restOfLetters = userInput.substring(1);

        firstLetter = firstLetter.toUpperCase();

        System.out.println("LowerCase " + userInput.toLowerCase());
        System.out.println("UpperCase" + userInput.toUpperCase());
        System.out.println("first Letter Uppercase " + firstLetter + restOfLetters);
    }
}
