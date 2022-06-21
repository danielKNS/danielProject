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

       for(Integer w = userInput.length()-1; w >= 0; w--){
        string += userInput.charAt(w);
       }

       System.out.println("Your word id reverse is: " + string);
    //    return string;
    }
}
