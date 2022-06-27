import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.Random;
public class Calculator {
    // public static void main(String[] args) {
    //     options();
    // }
    
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick either 1(Add),2(Subtract),3(Multiply) or 4(Divide): ");
       
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
            System.out.println("Please choose a number: ");
            Integer userAddFirstNumber = scanner.nextInt();
            System.out.println("Please choose another number: ");
            Integer userAddSecondNumber = scanner.nextInt();
            Integer total1 = userAddFirstNumber + userAddSecondNumber;
            System.out.println("The total is: " + total1 );
            // return root;
            break;
            case 2:
            System.out.println("Please choose a number: ");
            Integer userSubtractFirstNumber = scanner.nextInt();
            System.out.println("Please choose another number: ");
            Integer userSubtractSecondNumber = scanner.nextInt();
            Integer total2 = userSubtractFirstNumber - userSubtractSecondNumber;
            System.out.println("The total is: " + total2 );
            // return formattedDate;
            break;
            case 3:
            System.out.println("Please choose a number: ");
            Integer userMultiplyFirstNumber = scanner.nextInt();
            System.out.println("Please choose another number: ");
            Integer userMultiplySecondNumber = scanner.nextInt();
            Integer total3 = userMultiplyFirstNumber * userMultiplySecondNumber;
            System.out.println("The total is: " + total3 );
            break;
            case 4:
            System.out.println("Please choose a number: ");
            Integer userDivideFirstNumber = scanner.nextInt();
            System.out.println("Please choose another number: ");
            Integer userDivideSecondNumber = scanner.nextInt();
            Integer total4 = userDivideFirstNumber / userDivideSecondNumber;
            System.out.println("The total is: " + total4 );
            break;
            
        }
    }
}
