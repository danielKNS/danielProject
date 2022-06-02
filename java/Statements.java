// import java.security.KeyStore.Entry;
import java.util.Collections;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;
// import java.util.function.Consumer;
// import java.util.List;

// 
public class Statements {
     public static void main(String[] args) {
        System.out.println("------- IF STATEMENT------");
        String name1 = "Lucas";
        String name2 = "Daniel";

        if(name1== name2){
            System.out.println("name are the same ");
        } else {
            System.out.println("there are not the same!!!");
        }

        System.out.println("------For Loop---------");

        Integer arr[] = new Integer[]{2,4,5,1,10,8,7,34,20,0,-5}; // my numbers

        Integer smallest = arr[0]; // starts with 2
        Integer largest = arr[0]; // starts with 2

        for(Integer n = 0; n< arr.length; n++){ // i am checking if the numbers is less or greater then 0
            if(arr[n] > largest)
            largest = arr[n];
            else if(arr[n]< smallest);
            smallest= arr[n];
        }
        System.out.println("Largest number is : %s".formatted(largest));
        System.out.println("Smallest number is : %s".formatted(smallest));

        System.out.println("----------For Loop version 2-----------");

        Integer myArray[] = new Integer[]{2,4,5,1,10,8,7,34,20,0,-5}; // array of integer

        Integer smallests = myArray[0]; // Integer.MIN_VALUE
        Integer largests = myArray[0]; // Integer.MAX_VALUE 

        for(int number : myArray){ // taking each element in the array  numbers starts with 2
            if(number>largests){
                largests=number;
            }else if (number<smallests){
                smallests=number;
            }
        }
        System.out.println("Largest number is : %s".formatted(largests));
        System.out.println("Smallest number is : %s".formatted(smallests));

        // proper way doing this:

        // Integer myArray[] = new Integer[]{2,4,5,1,10,8,7,34,20,0,-5};

        // Integer smallests = myArray[0]; // Integer.MIN_VALUE
        // Integer largests = myArray[0]; // Integer.MAX_VALUE 

        // for(int number : myArray){ 
        //     if(number>largests){
        //         largests=number;
        //     }
        //  }

        // System.out.println("Largest number is : %s".formatted(largests));

        // for(int number : myArray){ 
        //     if(number>smallests){
        //         smallests=number;
        //     }
        //  }

        // System.out.println("Largest number is : %s".formatted(smallests));

        // System.out.println("Largest number is : %s".formatted(largests));
        // System.out.println("Smallest number is : %s".formatted(smallests));
        
        System.out.println("------ForEach Loop---------");

        List<Integer> numbers = List.of(2,4,5,1,10,8,7,34,20,0,-5,2);

        Integer testnumber = numbers.get(0);

        Integer minNumber = Collections.min(numbers);
        Integer maxNumber = Collections.max(numbers);

        System.out.println("Smallest number is : %s".formatted(testnumber)); //<---- this is how you get first index of the array when you have a List<Integer>
        System.out.println("Smallest number is : %s".formatted(minNumber));
        System.out.println("Largest number is : %s".formatted(maxNumber));

        // numbers.forEach((temp) -> {
        //     System.out.println("ForEach : %s".formatted(temp));
        // });
        
        // System.out.println("------Mapping---------");

        // HashMap<String, Integer> map = new HashMap<>();

        // map.put("HI ",0 );
        // map.put("hey my age is ",17);
        // map.put("Alright the chips will be ",3);

        // Consumer<Map.Entry<String,Integer>> action = entry -> {
        //     System.out.printf("String(Key): %s", entry.getKey());
        //     System.out.printf("Value: %s", entry.getValue());
        // };

        // map.entrySet().forEach(action);
        Integer result1 = addNumber(57 , 253);
        System.out.println("result 1 :  %s".formatted(result1));
    }

    public static Integer addNumber(Integer firstNumber, Integer secondNumber){ // its returning a integer
        Integer sum = firstNumber + secondNumber;

        return sum;
    }
}
