import java.util.List;

import javax.xml.stream.events.Comment;

public class SocialMediaApp2 {
    
    public static void main(String[] args) {
        System.out.println("----------WELCOME TO CLIMAX------------");
        // one to many relationship; one user can make many posts
        // one to one; one user to one post

        Comment2 comment1 = new Comment2(1,"Wow what a cute dog :) ");
        Comment2 comment2 = new Comment2(2,"OMG CONGRATS ");
        Comment2 comment3 = new Comment2(3,"HOLA PEDRO :) ");
        Comment2 comment4 = new Comment2(4,"HOLA PEDRO :) ");
        Comment2 comment5 = new Comment2(5,"HOLA PEDRO :) ");
        Comment2 comment6 = new Comment2(6,"HOLA PEDRO :) ");

        List<Comment2> post1Comments = List.of(comment1);
        List<Comment2> post2Comments = List.of(comment2);
        List<Comment2> post3Comments = List.of(comment3);
        List<Comment2> post4Comments = List.of(comment4);
        List<Comment2> post5Comments = List.of(comment5);
        List<Comment2> post6Comments = List.of(comment6);

        Post2 post1 = new Post2(1,"Look at Jack! ",post1Comments);
        Post2 post2 = new Post2(2,"THIS IS AMAZING I WON! ",post2Comments);
        Post2 post3 = new Post2(3,"this is pedro mi hermano ",post3Comments);
        Post2 post4 = new Post2(4,"this is pedro mi hermano ",post4Comments);
        Post2 post5 = new Post2(5,"this is pedro mi hermano ",post5Comments);
        Post2 post6 = new Post2(6,"this is pedro mi hermano ",post6Comments);

        List<Post2> user1Posts = List.of(post1);
        List<Post2> user2Posts = List.of(post2,post3);
        List<Post2> user3Posts = List.of(post4,post5,post6);
        // System.out.println("-------USER 1--------");
        //REMBEMBER: to get an INSTANCE OF CLASS you must INSTANCIATE IT.
        User2 user1 = new User2(1,"Daniel","Ribero","data02@gmail.com",user1Posts);
        // System.out.println("-------USER 2--------");
        User2 user2 = new User2(2,"Gabriel","Sanots","gabi007@gmail.com",user2Posts);
        // System.out.println("-------USER 3--------");
        User2 user3 = new User2(3,"Pablo","Cardozo","pabloHermamo@gmail.com",user3Posts); 

        System.out.println("-----------------USER 1--------------------");
        System.out.println(user1);
        // System.out.println(post1);
        System.out.println(comment1);
        System.out.println("-----------------USER 2--------------------");
        System.out.println(user2);
        // System.out.println(post2);
        System.out.println(comment2);
        System.out.println("-----------------USER 3--------------------");
        System.out.println(user3);
        // System.out.println(post3);
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
