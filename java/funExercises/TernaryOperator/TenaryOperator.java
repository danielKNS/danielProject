import java.util.Scanner;

public class TenaryOperator {
    public static void main(String[] args) {
        System.out.println("-----Description: finding the biggest number of 2 using a ternary----");
        tenaryOperator();
    }
    private static void tenaryOperator(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick one numbers:  ");
        Integer userInput1 = scanner.nextInt();
        System.out.println("First Number: " + userInput1);

        System.out.println("Pick another numbers:  ");
        Integer userInput2 = scanner.nextInt();
        System.out.println("Second Number: " + userInput2);

        
        //declaring my variable
        Integer n1 = userInput1, n2 = userInput2, result;

        result = (n1 > n2) ? n1 : n2; // condional oporator

        System.out.println("the Largest number betwwen " + n1 + " and " + n2 +" is: " + result);
    }
}
