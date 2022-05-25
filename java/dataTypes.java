import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// everything must be inside a class.ALSO to update you need to {javac dataTypes.java then java DataTypes}
// understand to the best capabilities what all these words in the method means ?
// Class is a container for related funtions(Basically classes organize our code )
class DataTypes{
// 1) "void" specifies that the method should NOT have a return any value.
// 2) "Static" is when associated with a method, making it class related method.
// 3) "Main" is the entry point to our program.(whenever we execute a java the main function 
// gets called and the code inside will gets executed).
// 4) "public" is an access modifier used for classes,attributes,method and constructors making them accessible by any other class.
// 5) Static A non-access modifier used for methods and attributes.(it makes a method accessable withou using class)
// 6)(String[] args) it stores java command line arguments.(the argument that the funtions receives.)
    public static void main(String[] args) { //Method(When a function belongs to a class its called a "Method".)
        System.out.println("----------Data Types-------- :");

        System.out.println("----Strings----- :");
        
        String string = "i am a string"; //semi
        String string1 = "I LIVE IN THE USA";
        String string2 = "I love volleyball!!";
        
        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);

        System.out.println("----Numbers----- :");
        // what is te differents ?
        BigDecimal n = new BigDecimal(23.5); // runs the decimals
        Float myFloat = 99.9f; // runs the decimal
        Integer number = 12; // only whole numbers.
    
        System.out.println(n);
        System.out.println(myFloat);
        System.out.println(number);
        System.out.println(number + number);

        System.out.println("-----Boolean------ :");

        boolean isHappy = true;
        boolean isSad = false;

        System.out.println(isHappy);
        System.out.println(isSad);

        System.out.println("-----Null------ :"); // anything in java is nullable

        String str = null;
        Number something = null;
        Boolean somethingElse = null;

        System.out.println(str);
        System.out.println(something);
        System.out.println(somethingElse);

        System.out.println("-----Array------ :");

        char[] array = {'A','B','C','D'};

        System.out.println(array);

        ArrayList<String> anotherArray = new ArrayList<>(); // an array without a specific size
        anotherArray.add("I ");
        anotherArray.add("AM ");
        anotherArray.add("AN ");
        anotherArray.add("ARRAY!");
        Collections.addAll(anotherArray,"third", "forth");

        System.out.println(anotherArray);

        Number[] anotherArray1 = {1,2,3,4};

        System.out.println(anotherArray1[0]);
        System.out.println(anotherArray1[1]);
        System.out.println(anotherArray1[2]);
        System.out.println(anotherArray1[3]);
        
        List<String> myList = List.of("one","two","third");

        System.out.println(myList);

        System.out.println("-----Object------ :"); // objects TBD

        // Object object = new Object();
        
        // int x = 12;

        // System.out.println(object.x);
        // how to create a synout all the main data types we learned in TS
        // string * , number * , booleans *, null *, undefined doe not ,array * ,objects *

        System.out.println("-----Static Function------ :");
        tellMeAJokes();

       Integer result1 = addNumber(500 , 23);
       System.out.println("result 1 :  %s".formatted(result1));

       Integer result2 = addNumber(5 , 23);
       System.out.println("result 2 :  %s".formatted(result2));
    }
    
    // Static Function
    public static void tellMeAJokes() { // it Not returning anything

        System.out.println("Emre like sniffing feet ?");
    }

    public static Integer addNumber(Integer firstNumber, Integer secondNumber){ // its returning a integer
        Integer result = firstNumber + secondNumber;

        return result;
    }
}
