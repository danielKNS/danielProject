import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        System.out.println("----Description: create a program that reverses a string----");
        reversingString();
    }
    private static void reversingString(){
        Scanner scanner = new Scanner(System.in);
       System.out.println("what is your word ? :  ");

       String userInput = scanner.nextLine();
        //    System.out.println(userInput);

       String string ="";
        // l = userInput.length()-1 is going to the last letter of the string
        // l-- = is going in the reverse For Example: 123 with l++, 321 with
       for(Integer l = userInput.length()-1; l >= 0; l--){
        string += userInput.charAt(l);
        //.charAt returns a character at a specific index position in a string.
        // i am adding the empty string with the reverse word
       }

       System.out.println("Your word id reverse is: " + string);
    //    return string;
    }
}
