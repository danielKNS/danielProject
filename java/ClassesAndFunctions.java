import java.util.List;

public class ClassesAndFunctions {
    public static void main(String[] args) {
        System.out.println("Hello from main in Class and Functions");

        String color = getColour();
        sayHello();
        sayHelloTo("Daniel"); // calling the method in here
        Integer returnValue = calculateTotal(20,6); // passing the 20 and 6
        System.out.println("The Total is : %s".formatted(returnValue)); // the value of method is assigning to returnValue
        
        System.out.println("The Color : %s".formatted(color));

        Integer value = calculateTotal(2,6);
        System.out.println("The Total is : %s".formatted(value));

        System.out.println("-------Calling MyStaticClass----------");
        MyStaticClass.printFavoriteColor();

        MyStaticClass.calculateTotal(45, 2, 1.5);

        List<String> ourNames = List.of("Daniel","Jasons","Caloss");
        Boolean result2 = MyStaticClass.areNamesSameLenght(ourNames);
        System.out.println("The ourNames is it true ? : %s".formatted(result2));
    }
    public static void sayHello(){
        System.out.println("hello from sayHello");
    }

    public static void sayHelloTo(String name){ // funtion definition
        System.out.println("say hello to %s".formatted(name));

    }

    public static Integer calculateTotal(Integer subTotal,Integer tip){ // now you need to call the function
        Integer result= subTotal + tip; // do the math
        return result; // return the value
    }

    public static String getColour(){ // now you need to call the function // do the math
        return "red"; // return the value
    }
}
