import java.util.Scanner;

public class WordCasingConverter {
    public static void main(String[] args) {
        System.out.println("-----Description: Create a program that allows the user to change the case of a word they put in-----");
        wordCasingConverter();
    }
    private static void wordCasingConverter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your word ? ");

        String userInput = scanner.nextLine();
        //get first letter of the string.
        String firstLetter = userInput.substring(0,1);
        //get the reamaining letters.
        String restOfLetters = userInput.substring(1);
        //Substring in Java is a commonly used method of java.lang.String class that is used to create smaller strings from the bigger one.
        //As strings are immutable in Java, the original string remains as it is, and the method returns a new string.

        firstLetter = firstLetter.toUpperCase();

        System.out.println("LowerCase: " + userInput.toLowerCase());
        System.out.println("UpperCase: " + userInput.toUpperCase());
        System.out.println("first Letter Uppercase: " + firstLetter + restOfLetters);
    }
}
