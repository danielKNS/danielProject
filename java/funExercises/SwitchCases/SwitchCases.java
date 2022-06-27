// import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SwitchCases {
    public static void main(String[] args) {
        System.out.println("---Description: create a program that lets user perform actions depending on input----");
        options();
    }

    private static void options(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick either 1, 2 or 3");
       
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
            System.out.println("Please choose a number to square root: ");
            Integer userSquareRoot = scanner.nextInt();
            double root = Math.sqrt(userSquareRoot);
            //Math.sqrt is a method to return the sqare root of the number
            System.out.println("The square root of " + userSquareRoot + " is: " + root);
            // return root;
            break;
            case 2:
            SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
            Calendar calendar = Calendar.getInstance();
            // method of java.util.Calendar class is a Static method. This method is used with calendar object to get the instance
            // of calendar according to current time zone set by java Runtime environment.

            Date dateObj = calendar.getTime();
            //getTime is a method of Java Date class returns the number of milliseconds since January 1, 1970, 00:00:00 GTM which is represented by Date object.
            //Format is an abstract base class for formatting locale-sensitive information such as dates, messages, and numbers
            String formattedDate = date.format(dateObj);
            System.out.println("Today date is: " + formattedDate);
            // return formattedDate;
            break;
            case 3:
            String[] myJokes = {
            "Why do we tell actors to 'break a leg?': Because every play has a cast."
            ,"Did you hear about the claustrophobic astronaut?: He just needed a little space."
            ,"Hear about the new restaurant called Karma?: There’s no menu: You get what you deserve. "
            ,"Why don’t scientists trust atoms?: Because they make up everything. "
            ,"What sits at the bottom of the sea and twitches?: A nervous wreck. "};
            Random random = new Random();
            Integer randomNumber = random.nextInt(myJokes.length);
            System.out.println(myJokes[randomNumber]);// getting random index[jokes]
            System.out.println("does user want to continue press 1 if not press 0 ");
            Integer userAnswer = scanner.nextInt(); // ask for user input
            System.out.println("user choose: "+ userAnswer);
            if (userAnswer == 0){
                System.exit(1);
            }else{
                options();
            }
        }
    }
}
