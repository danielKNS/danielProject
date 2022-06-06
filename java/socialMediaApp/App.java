import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("----------WELCOME TO CLIMAX------------");

        // System.out.println("-------USER 1--------");
        Users user1 = new Users(1,"Daniel","Ribero","data02@gmail.com");
        Posts post1 = new Posts(1,"Look at Jack! ");
        Comments comment1 = new Comments(1,"Wow what a cute dog :) ");
        // System.out.println("-------USER 2--------");
        Users user2 = new Users(2,"Gabriel","Sanots","gabi007@gmail.com");
        Posts post2 = new Posts(2,"THIS IS AMAZING I WON! ");
        Comments comment2 = new Comments(2,"OMG CONGRATS ");
        // System.out.println("-------USER 3--------");
        Users user3 = new Users(3,"Pablo","Cardozo","pabloHermamo@gmail.com");
        Posts post3 = new Posts(3,"this is pedro mi hermano ");
        Comments comment3 = new Comments(3,"HOLA PEDRO :) ");

        System.out.println("-----------------USER 1--------------------");
        System.out.println(user1);
        System.out.println(post1);
        System.out.println(comment1);
        System.out.println("-----------------USER 2--------------------");
        System.out.println(user2);
        System.out.println(post2);
        System.out.println(comment2);
        System.out.println("-----------------USER 3--------------------");
        System.out.println(user3);
        System.out.println(post3);
        System.out.println(comment3);
        
        System.out.println("--------(Creating) List of 3 Users---------");

        List<Users> users = List.of(user1,user2,user3);
        users.forEach(user -> {
            System.out.println("User:" + users);
            // System.out.println(users);
        });
        // List<Posts>  posts1 = List.of(post1,post2);
        // List<Comments> comments1 = List.of(comment1,comment2);


    }
}
