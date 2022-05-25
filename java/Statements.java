import java.util.List;

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
        List<Integer> numbers = List.of(2,4,5,1,10,8,7,34,20,0,-5,2);
        System.out.println("numbers %s".formatted(numbers));
        // figure out the largest and smallest numbers
        // create a static function for each

        // repeat the number
    }
}
