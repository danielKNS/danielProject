import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("----------WELCOME TO CLIMAX------------");
        // one to many relationship; one user can make many posts
        // one to one; one user to one post

        // System.out.println("-------USERS--------");
        //REMBEMBER: to get an INSTANCE OF CLASS you must INSTANCIATE IT.
        User user1 = new User(1,"Daniel","Ribero","data02@gmail.com");
        User user2 = new User(2,"Gabriel","Sano","gabi007@gmail.com");
        User user3 = new User(3,"Pablo","Cardozo","pabloHermamo@gmail.com");
        User user4 = new User(4,"Felipe","Tiago","felps@gmail.com");
        User user5 = new User(5,"Pedro","Santos","pepe@gmail.com");
        User user6 = new User(6,"Nicolas","Costa","Costanicolas@gmail.com");
        User user7 = new User(7,"Rafael","Rocha","rafarocah@gmail.com");
       
        // System.out.println("-------POSTS--------");
        //Posts: ID, TEXT, UserID(The person that upload the post)
        Post post1 = new Post(1,"Look at Jack! ",1);
        Post post2 = new Post(2,"THIS IS AMAZING I WON! ",2);
        Post post3 = new Post(3,"this is pedro mi hermano ",3);
        Post post4 = new Post(4,"wowowowwoo ",4);
        Post post5 = new Post(5,"SHEEEEESH ",5);
        Post post6 = new Post(6,"bro....you are actually pretty",6);
        Post post7 = new Post(7,"AYOO THAT IS MY BOYYYYYYY!!!!! ",7);
        // System.out.println("-------COMMENTS--------");
        Comment comment1 = new Comment(1,"Wow what a cute dog :) ");
        Comment comment2 = new Comment(2,"OMG CONGRATS ");
        Comment comment3 = new Comment(3,"HOLA PEDRO :) ");
        Comment comment4 = new Comment(4,"HOLA PEDRO :) ");
        Comment comment5 = new Comment(5,"HOLA PEDRO :) ");
        Comment comment6 = new Comment(6,"HOLA PEDRO :) ");
        Comment comment7 = new Comment(7,"HOLA PEDRO :) ");

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

        // List<Users> users = List.of(user1,user2,user3);
        // users.forEach(user -> {
        //     System.out.println("User:"+ users);
        // });
        // List<Posts>  posts1 = List.of(post1,post2);
        // List<Comments> comments1 = List.of(comment1,comment2);

        
    }
}

//NOTES: 
/* PRIMARY KEY:
 * A primary key is used to ensure data in the specific column is unique
 * Properties of a Primary Key:
 * A relation can contain only one primary key.
 * A primary key may be composed of a single attribute known as single primary key or
 more than one attribute known as composite key.
 * A primary key is the minimum super key.
 * The data values for the primary key attribute should not be null.
 * FOREIGN KEY:
 * its used to maitain relationship between tables.
 * it can accept the null values.
 * it can carry duplicate value for foreign keys attributes.
 * by default it is not clustered index
 * it cant be defined on temporary tables.
 */
