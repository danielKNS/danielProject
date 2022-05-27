import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        System.out.println("hello ");

        Scanner scanner = new Scanner(System.in); // we instaciante a scanner object
        System.out.print("What is you name ? ");

        String userInput = scanner.nextLine(); // ask for user input
        System.out.println("hello," + userInput);

        System.out.println("please pick either 1, 2 or 3");
        Integer useNumberPick = scanner.nextInt();
        System.out.println("user picked number: "+ useNumberPick);
        if (useNumberPick == 3){
            System.out.println("jaja you dies");
            System.exit(1); // stop the program
        }

        System.out.println("Are you Hungry: ");
        Boolean isHungry = scanner.nextBoolean();
        System.out.println("User status : " +isHungry );
    }
}
