public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }
    private static void fibonacci(){
        System.out.println("Please choose any number: ");
        int n = 25, firstTerm =0 , secondTerm =1 ;

        // Integer userNumber = scanner.nextInt();
        // int firstTerm = 0, secondTerm = 1;
        System.out.println("Your Fibonacci Number: " + n);

        for(int i = 1; i<= n; i++){
            System.out.println(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm= nextTerm;
        }
    }
}

