import java.util.Scanner;

public class InterestRateCalculator {
    public static void main(String[] args) {
        System.out.println("-----Description: Create a program that will figure out the total interest on a $ principal amount----");
        
        interestRateCalculator();
    }
    private static void interestRateCalculator(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Amount of Principal:  ");
        Integer principal = scanner.nextInt();
        System.out.println("Amount of principal from User: " + principal);

        System.out.println("Interest Rate:  ");
        Double interestRate = scanner.nextDouble();
        System.out.println("Interest rate from User: " + interestRate);

        System.out.println("Years for the loan:  ");
        Integer time = scanner.nextInt();
        System.out.println("Years of loan from User: " + time);

        Double result = (principal*interestRate*time) / 100;

        System.out.println("The total Interest: " + result);
    }
}
