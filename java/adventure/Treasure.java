package java.adventure;

import java.util.Scanner;

public class Treasure {
    public static void treasureCaller() {
        System.out.print("---------------------You Entered to a Treasure Room--------------------- ");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);  // we instaciante a scanner object
        System.out.println("Pick a door either 1st, 2st or 3st");
        // getting the user number and assigning it to useDoorPick
        Integer userDoorPick = scanner.nextInt(); 
        System.out.println("user picked number: "+ userDoorPick);
        if (userDoorPick == 1){
            System.out.println("You awaken the Dragon..... YOU DIED!");
            System.exit(1); // stop the program
        }else{
            System.out.println("You Passed to the dragon and got the treasure");
        }
    }

}
