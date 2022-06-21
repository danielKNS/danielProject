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
       System.out.println("User word: "+userInput);

       Integer charater = 0;


       for(Integer c = 0; c < userInput.length(); c++){
           if(userInput.charAt(c)!= ' ') // avoiding counting space.
           charater++; // increase the count of the characters in the given string.
       }
       System.out.println("your word has: " + charater);
    }
}
