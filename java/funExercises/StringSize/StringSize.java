import java.util.Scanner;

public class StringSize {
    public static void main(String[] args) {
        System.out.println("----Description: find the number of characters in a string----");
       stringSize();
    }
    private static void stringSize(){
        Scanner scanner = new Scanner(System.in);
       System.out.println("what is your word ? ");

       String userInput = scanner.nextLine();
        //    System.out.println("User word: "+userInput);

       System.out.println("your word: " +userInput + " has: "+ userInput.length() + " characters");
    }
}
