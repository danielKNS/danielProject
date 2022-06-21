import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = scanner.nextInt();
        BigInteger fact = factorial(n);

        System.out.println("user input: "+ n + " Factorial number: " +fact);
       
    }
    private static BigInteger factorial(int value) {

        BigInteger result = BigInteger.ONE;
   
           if (value != 0 && value != 1) {
   
               for (int i = 2; i <= value; i++) {
   
                   result = result.multiply(BigInteger.valueOf(i));
               }
           }
   
           return result;
       }
    
}
