import java.util.List;
import java.util.function.Predicate;

public class Function {
    public static void main(String[] args) {
        
        System.out.println("-------------USER 1--------------");

        Object user1 = new Object("Daniel","Ribeiro",17,5,"Black","volleyball",1200);

        System.out.println("user1: " + user1.firstName);
        System.out.println("user1: " + user1.lastName);
        System.out.println("user1: " + user1.age);
        System.out.println("user1: " + user1.luckyNumber);
        System.out.println("user1: " + user1.favoriteColor);
        System.out.println("user1: " + user1.favoriteSport);
        System.out.println("user1: " + user1.salary);

        System.out.println("-------------USER 2--------------");
        Object user2 = new Object("Jonas","Roberto",21,54,"White","Soccer",32000);

        System.out.println("user1: " + user2.firstName);
        System.out.println("user1: " + user2.lastName);
        System.out.println("user1: " + user2.age);
        System.out.println("user1: " + user2.luckyNumber);
        System.out.println("user1: " + user2.favoriteColor);
        System.out.println("user1: " + user2.favoriteSport);
        System.out.println("user1: " + user2.salary);

        System.out.println("-------------USER 3--------------");
        Object user3 = new Object("Laura","Menezes",19,21,"Yellow","Boxing",45000);

        System.out.println("user1: " + user3.firstName);
        System.out.println("user1: " + user3.lastName);
        System.out.println("user1: " + user3.age);
        System.out.println("user1: " + user3.luckyNumber);
        System.out.println("user1: " + user3.favoriteColor);
        System.out.println("user1: " + user3.favoriteSport);
        System.out.println("user1: " + user3.salary);

        System.out.println("-------------USER 4--------------");
        Object user4 = new Object("Mathew","light",56,1,"grey","Football",67800);

        System.out.println("user1: " + user4.firstName);
        System.out.println("user1: " + user4.lastName);
        System.out.println("user1: " + user4.age);
        System.out.println("user1: " + user4.luckyNumber);
        System.out.println("user1: " + user4.favoriteColor);
        System.out.println("user1: " + user4.favoriteSport);
        System.out.println("user1: " + user4.salary);

        System.out.println("-------------USER 5--------------");
        Object user5 = new Object("Pedro","Santos",75,5,"Orange","Tennis",57900);

        System.out.println("user1: " + user5.firstName);
        System.out.println("user1: " + user5.lastName);
        System.out.println("user1: " + user5.age);
        System.out.println("user1: " + user5.luckyNumber);
        System.out.println("user1: " + user5.favoriteColor);
        System.out.println("user1: " + user5.favoriteSport);
        System.out.println("user1: " + user5.salary);


        // List<Object> usersObject = usersObject.stream().filter(user ->
        // user.age > 40)

        // List<Object> users = List.of(user1,user2,user3,user4,user5);

       

        
    }
    
}
