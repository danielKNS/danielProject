import java.util.Scanner;

public class StringSize {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("what is your word ? ");

       String userInput = scanner.nextLine();
       System.out.println(userInput);

       Integer charater = 0;


       for(Integer c = 0; c < userInput.length(); c++){
           if(userInput.charAt(c)!= ' ') // avoiding counting space.
           charater++; // increase the count of the characters in the given string.
       }
       System.out.println("your word has: " + charater);
    }
}
