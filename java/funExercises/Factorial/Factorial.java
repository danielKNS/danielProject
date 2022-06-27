import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("------Description: Create a program that computes the factorial value of an inputed number---------");
        factorialResult();
    }
    private static void factorialResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int userInputNumber = scanner.nextInt();
        BigInteger result = factorial(userInputNumber);

        System.out.println("user input: "+ userInputNumber + " Factorial number: " + result);
    }
    private static BigInteger factorial(Integer value) {
        //BigInteger provides analogues to all of Java's primitive integer operators, and all relevant methods from java.lang.Math.
        // Additionally, BigInteger provides operations for modular arithmetic
        //Some constants are also defined in BigInteger class for ease of initialization like: BigInteger.ONE etc.
        BigInteger result = BigInteger.ONE;
   
           if (value != 0 && value != 1) {
   
               for (Integer i = 2; i <= value; i++) {
                    //The .multiply() method of java BigDecimal class is used to obtain a BigDecimal whose value is (this × multiplicand)
                   result = result.multiply(BigInteger.valueOf(i));
                   //The .valueOf() method converts data from its internal form into a human-readable form. It is static method that is overloaded within string for all
                   // of Java’s build-in types, so that each type can be converted properly into a string.
               }
           }
   
           return result;
       }
    
}
