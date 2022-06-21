import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
    
        sumOfEvenAndOdd();
    }
    private static List<Integer> sumOfEvenAndOdd(){
        List<Integer> myarray = new ArrayList<Integer>();
        System.out.println("--------------list of array 0 to 100---------------- ");
        for(Integer n = 0; n <= 100; n++){
         myarray.add(n);
         System.out.println("number: " + myarray.get(n));
        }

        System.out.println("--------------Even Numbers---------------- ");
        myarray.stream().filter(n->n % 2 == 0).forEach(System.out::println);
        System.out.println("---------------Odd Numbers---------------- ");
        myarray.stream().filter(n->n % 2 == 1).forEach(System.out::println);

        return myarray;
    }
}
