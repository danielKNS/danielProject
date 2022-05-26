import java.util.List;

// if you execute without main class it wont do anything
//class needs main method/funtion.
// one class per file
// main is only one that gets execute when you run file.
// funtions are resuable code
// you only need to compile from the main file
public class MyStaticClass {

    public static void printFavoriteColor(){

        System.out.println("my favorite color is : Black");

    }
    public static void calculateTotal(Integer subTotal, Integer tip ,Double taxPercentage){
        Integer preTax = subTotal + tip;
        Double postTax = preTax * taxPercentage;
        Double result = preTax + postTax;
        System.out.println("The Result is : %s".formatted(result));
    }

    public static Boolean areNamesSameLenght(List<String> names){
        Integer previousNameLenght = names.get(0).length();
        for (String name : names){
            System.out.println("name: %s".formatted(name));
            if (name.length() != previousNameLenght){
                return false;
            }
        };
        return true;
    }
}

// work on fizzbuzz