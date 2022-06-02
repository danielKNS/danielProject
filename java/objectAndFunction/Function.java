import java.util.ArrayList;
import java.util.List;
// import java.util.function.Predicate;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Function {
    public static void main(String[] args) {
        
        System.out.println("-------------USER 1--------------");

        Object user1 = new Object("Daniel","Ribeiro",17,5,"Black","volleyball",1200);

        System.out.println("user1 firstName: " + user1.getFirstName());
        System.out.println("user1 lastName: " + user1.getLastName());
        System.out.println("user1 Age: " + user1.getAge());
        System.out.println("user1 Lucky Number: " + user1.getLuckyNumber());
        System.out.println("user1 Favorite Color: " + user1.getFavoriteColor());
        System.out.println("user1 Favorite Sport: " + user1.getFavoriteSport());
        System.out.println("user1 Salary: " + user1.getSalary());

        System.out.println("-------------USER 2--------------");
        Object user2 = new Object("Jonas","Roberto",21,54,"White","Soccer",32000);
        System.out.println("user2 firstName: " + user2.getFirstName());
        System.out.println("user2 lastName: " + user2.getLastName());
        System.out.println("user2 Age: " + user2.getAge());
        System.out.println("user2 Lucky Number: " + user2.getLuckyNumber());
        System.out.println("user2 Favorite Color: " + user2.getFavoriteColor());
        System.out.println("user2 Favorite Sport: " + user2.getFavoriteSport());
        System.out.println("user2 Salary: " + user2.getSalary());

        System.out.println("-------------USER 3--------------");
        Object user3 = new Object("Laura","Menezes",19,21,"Yellow","Boxing",45000);

        System.out.println("user3 firstName: " + user3.getFirstName());
        System.out.println("user3 lastName: " + user3.getLastName());
        System.out.println("user3 Age: " + user3.getAge());
        System.out.println("user3 Lucky Number: " + user3.getLuckyNumber());
        System.out.println("user3 Favorite Color: " + user3.getFavoriteColor());
        System.out.println("user3 Favorite Sport: " + user3.getFavoriteSport());
        System.out.println("user3 Salary: " + user3.getSalary());

        System.out.println("-------------USER 4--------------");
        Object user4 = new Object("Mathew","light",56,1,"grey","Football",67800);

        System.out.println("user4 firstName: " + user4.getFirstName());
        System.out.println("user4 lastName: " + user4.getLastName());
        System.out.println("user4 Age: " + user4.getAge());
        System.out.println("user4 Lucky Number: " + user4.getLuckyNumber());
        System.out.println("user4 Favorite Color: " + user4.getFavoriteColor());
        System.out.println("user4 Favorite Sport: " + user4.getFavoriteSport());
        System.out.println("user4 Salary: " + user4.getSalary());

        System.out.println("-------------USER 5--------------");
        Object user5 = new Object("Pedro","Santos",75,5,"Orange","Tennis",89900);

        System.out.println("user5 firstName: " + user5.getFirstName());
        System.out.println("user5 lastName: " + user5.getLastName());
        System.out.println("user5 Age: " + user5.getAge());
        System.out.println("user5 Lucky Number: " + user5.getLuckyNumber());
        System.out.println("user5 Favorite Color: " + user5.getFavoriteColor());
        System.out.println("user5 Favorite Sport: " + user5.getFavoriteSport());
        System.out.println("user5 Salary: " + user5.getSalary());


        var users = List.of(user1,user2,user3,user4,user5);

        var result = new ArrayList<Object>();

        for (Object user : users){
            if (user.getAge() > 30){
                result.add(user);
            }
        }
        System.out.println(result);


        // List<Object> users = List.of(user1,user2,user3,user4,user5); 
        // users.forEach(user -> {
        //     System.out.println("The following people: " + user.getFirstName());
        // });
        
        // List<Object> usersObject = usersObject.stream().filter(user ->
        // user.age > 40)

        // List<Object> users = List.of(user1,user2,user3,user4,user5);


        // List<Object> users = users.stream().filter
        // (user -> user.getAge() > 30).collect(Collectors.toList()); i am putting in the list

        //.collect = collect my list and put it in a list
        List<Object> oldUsers = users.stream().filter(user -> user.getAge() >= 30).collect(Collectors.toList());
        System.out.println(" these user are old" + oldUsers);// console log checking if is giving what i want
       
        oldUsers.forEach(user -> {
            System.out.println("USER: " + user.getFirstName() + " " + user.getLastName());
        });

        
    }
    
}
