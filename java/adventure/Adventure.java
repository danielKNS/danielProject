package java.adventure;

import java.util.List;
import java.util.Scanner;
//java Adventure  javac Adventure.java 
public class Adventure {
    public static void main(String[] args) { 
        System.out.print("---------------------Complete to play the game ---------------------");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in); // we instanciante a scanner object
        System.out.print("What is you name ? ");

        String userInput = scanner.nextLine(); // ask for user input
        System.out.println("Hello, " + userInput +" Welcome to the Game of End ");

        System.out.println("Please pick either: Knight, Mage or Assassin");
        String userHeroPick = scanner.next();
        System.out.println("user picked Role: "+ userHeroPick + " Get ready because if you go on the wrong path it might lead you to your END! ");

        System.out.print("---------------------Welcome to the End--------------------- ");
        System.out.println(" ");

        System.out.println("Please choose a door: Right , Front  or Left");
        String userChoice = scanner.next(); // asking for the user an input
        System.out.println("Plater picked Path: "+ userChoice);
         
        System.out.print("---------------------You Entered to a Dark Room--------------------- ");
        System.out.println(" ");

        System.out.println("Please pick either 1, 2 or 3");
        Integer useNumberPick = scanner.nextInt();// asking for the user an input
        System.out.println("user picked number: "+ useNumberPick);
        if (useNumberPick == 3){
            System.out.println("You fell to a trap in the dark room..... YOU DIED!");
            System.exit(1); // stop the program
        }else{
            System.out.println("You Almost Fallen to a trap but you were quick enough to escape BUT you are still in the Dark room ");
        }

        System.out.print("Pick a number between 1 to 10 : ");
        Integer userPointInput1 = scanner.nextInt(); // asking for the user and input and also using the input as a point
        // getting the input and assigning to userPointInput1.

        Integer point2 = calculateTotal(userPointInput1,9);// using method to calculate the total score of user

        System.out.println("Please pick a Button: 1, 2 or 3");
        Integer userButtonPick = scanner.nextInt();// asking for the user an input
        System.out.println("user picked number: "+ userButtonPick);
        if (userButtonPick == 2){
            System.out.println("You fell to you death in the dark room..... YOU DIED!");
            System.exit(1); // stop the program
        }else{
            System.out.println("You made the right choice you left the Dark Room ");
        }

        System.out.print("---------------------You Entered to a Dungeon--------------------- ");
        System.out.println(" ");

        System.out.println("Do you wish to Continue sir "+ userHeroPick+": ");
        Boolean isHungry = scanner.nextBoolean();// asking for the user an input
        System.out.println("User status : " +isHungry );

        System.out.print("Pick a number between 1 to 10 : ");
        Integer userPointInput2 = scanner.nextInt(); // asking for the user an input and input and also using the input as a point
        // getting the input and assigning to userPointInput2.

        Integer point1 = calculateTotal(userPointInput2,6); // using method to calculate the total score of user
        Treasure.treasureCaller(); // calling tresure.java
        Integer treasure = 56; //

        System.out.print("---------------------You Entered to a Safe Room--------------------- ");
        System.out.println(" ");

        List<Integer> usersPoints = List.of(point1 + point2 + treasure); // adding the total score of the player when he finished the game

        System.out.print("---------------------You Survived--------------------- ");
        System.out.println(" ");


        System.out.println("Your totalScore is : " + usersPoints); // the total score
    }

    private static Integer calculateTotal(Integer userPoint,Integer extraPoint){  // its returning a integer
        Integer result= userPoint + extraPoint;  // doing the math
        return result; // returning the result
    }
}
