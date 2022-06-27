import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("------Description: create a program that shows the first 25 Fibonacci numbers------");
        fibonacci();
    }
    private static void fibonacci(){
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println("Please choose any number: ");
        Integer n = 25;
        Integer firstTerm = 0 ;
        Integer secondTerm = 1 ;

        // Integer userNumber = scanner.nextInt();
        // int firstTerm = 0, secondTerm = 1;
        System.out.println("Your Fibonacci Number: " + n);

        for(Integer i = 1; i<= n; i++){
            myList.add(firstTerm);
            System.out.println(firstTerm + ", ");

            Integer nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println("----------------");
        System.out.println(myList);

    }
}

