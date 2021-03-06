import java.util.List;
// import java.util.function.Predicate;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Function {
    public static void main(String[] args) {
        
        System.out.println("-------------USER 1--------------");
        // Owner owner1 = new Owner("Daniel","Ribeiro", 25, 45,"Black","Volleyball",1200);
        // Owner owner2 = new Owner("Jonas","Roberto",21,54,"White","Soccer",32000);
        // Owner owner3 = new Owner("Laura","Menezes",19,21,"Yellow","Boxing",45000);
        // Owner owner4 = new Owner("Mathew","light",56,1,"Black","Football",67800);
        // Owner owner5 = new Owner("Pedro","Santos",75,5,"Orange","Tennis",89900);

        // List<Owner> ownerUsers = List.of(owner1,owner2,owner3,owner4,owner5);

        // Object user1 = new Object(ownerUsers);

        // System.out.println("Users: " + user1);
        Object user1 = new Object("Daniel","Ribeiro", 25, 45,"Black","Volleyball",1200);
        System.out.println("User1: " + user1);
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
        Object user5 = new Object("Pedro","Santos",75,5,"Orange","Tennis",89900 );

        System.out.println("user5 firstName: " + user5.getFirstName());
        System.out.println("user5 lastName: " + user5.getLastName());
        System.out.println("user5 Age: " + user5.getAge());
        System.out.println("user5 Lucky Number: " + user5.getLuckyNumber());
        System.out.println("user5 Favorite Color: " + user5.getFavoriteColor());
        System.out.println("user5 Favorite Sport: " + user5.getFavoriteSport());
        System.out.println("user5 Salary: " + user5.getSalary());


        // var users = List.of(user1,user2,user3,user4,user5);

        // var result = new ArrayList<Object>();

        // for (Object user : users){
        //     if (user.getAge() > 30){
        //         result.add(user);
        //     }
        // }
        // System.out.println(result);


        // List<Owner> users = List.of(owner1,owner2,owner3,owner4,owner5);
        List<Object> users = List.of (user1,user2,user3,user4,user5);
        users.forEach(user -> {
            System.out.println("The following people: " + user.getFirstName());
        });
        
        // List<Object> usersObject = usersObject.stream().filter(user ->
        // user.age > 40)

        // List<Owner> users1 = users.stream().filter
        // (user -> user.getAge() > 30).collect(Collectors.toList());
        //  i am putting in the list
        // List<Object> users = List.of(user1,user2,user3,user4,user5)
        //.collect = collect my list and put it in a list
        System.out.println("---------------OLD USERS-----------------");
        List<Object> oldUsers = users.stream().filter(user -> user.getAge() >= 30).collect(Collectors.toList());
        // System.out.println(" these user are old" + oldUsers);
        // console log checking if is giving what i want
       
        // getting oldUser and for each user i want to get their name and etc
        oldUsers.forEach(user -> {
            System.out.println("THIS user is above age 30: " + user.getFirstName() + " " + user.getLastName());
        });

        System.out.println("---------------YOUNG USERS-----------------");
        List<Object>youngUsers = users.stream().filter(user -> user.getAge() <= 30).collect(Collectors.toList());
        youngUsers.forEach(user -> {
        System.out.println("THIS user is under the age of 30: " + user.getFirstName() + " " + user.getLastName());
        });

        System.out.println("---------------LIST OF USERS THAT ARE UNDERPAID-----------------");
        List<Object> usersSalary = users.stream().filter(user -> user.getSalary() <= 35000).collect(Collectors.toList());
        usersSalary.forEach(user -> {
        System.out.println("THIS user: "+ user.getFirstName() + user.getLastName()+" is underpaind: "+ user.getSalary());
        });

        System.out.println("---------------TOTAL USERS THAT LIKE THE SAME NUMBER -----------------");
        List<Object> userLuckyNumber = users.stream().filter(user -> user.getLuckyNumber() == 5).collect(Collectors.toList());
        userLuckyNumber.forEach(user -> {
        System.out.println("THIS is "+ user.getFirstName() + " lucky number is : " + user.getLuckyNumber());
        });

        System.out.println("---------------TOTAL USERS THAT LIKE THE SAME COLOR -----------------");
        List<Object> userSameColor = users.stream().filter(user -> user.getFavoriteColor() == "Black").collect(Collectors.toList());
        userSameColor.forEach(user -> {
        System.out.println("THIS user: "+ user.getFirstName() + " FavoriteColor is: " + user.getFavoriteColor());
        });

        System.out.println("---------------TOTAL SALARY OF ALL USERS-----------------");
        Integer totalSalary = getTotalSalary(users);
        System.out.println("Total spend on salary: " + totalSalary);

    }

    // Funtions

    public static Integer getTotalSalary(List<Object> users){
        Integer totalSalaryCost = 0;
        for(Object user : users){
            totalSalaryCost = totalSalaryCost + user.getSalary();
        }
        return totalSalaryCost;
    }


    
}
