import java.util.List;
import java.util.stream.Collectors;

public class App {
public static void main(String[] args) {
    System.out.println("----------WELCOME TO CLIMAX------------");
    // one to many relationship; one user can make many posts
    // one to one; one user to one post

    
    // System.out.println("-------USERS--------");
    //REMBEMBER: to get an INSTANCE OF CLASS you must INSTANCIATE IT.
    User user1 = new User(1,"Daniel","Ribero","data02@gmail.com");
    User user2 = new User(2,"Gabriel","Sano","gabi007@gmail.com" );
    User user3 = new User(3,"Pablo","Cardozo","pabloHermamo@gmail.com");
    User user4 = new User(4,"Felipe","Tiago","felps@gmail.com");
    User user5 = new User(5,"Nicolas","Costa","Costanicolas@gmail.com");
    
    // System.out.println("-------POSTS--------");
    //Posts: ID, TEXT, UserID(The person that upload the post)
    Post post1 = new Post(1,"Look at Jack! ", user1.getId());
    Post post2 = new Post(2,"THIS IS AMAZING I WON! ",user1.getId());
    Post post3 = new Post(3,"this is pedro mi hermano ",user3.getId());
    Post post4 = new Post(4,"wowowowwoo ",user4.getId());
    Post post5 = new Post(5,"SHEEEEESH ",user5.getId());
    Post post6 = new Post(6,"bro....you are actually pretty",user5.getId());
    Post post7 = new Post(7,"AYOO THAT IS MY BOYYYYYYY!!!!! ",user2.getId());
    // the post ID then the DESCRIPTION of the post Then the USER who UPLOADED the post

    // System.out.println("-------COMMENTS--------");
    //Comment: ID , TEXT, postId(the post id, who posted the pic), UserId(who made the comment)
    Comment comment1 = new Comment(1,"Wow what a cute dog :) ", post1.getId(), user2.getId());
    Comment comment2 = new Comment(2,"OMG CONGRATS ",post2.getId(),user5.getId());
    Comment comment3 = new Comment(3,"HOLA PEDRO :) ",post3.getId(),user4.getId());
    Comment comment4 = new Comment(4," sheeesh my guy",post4.getId(),user4.getId());
    Comment comment5 = new Comment(5,"lol that is just wrong ",post5.getId(),user3.getId());
    Comment comment6 = new Comment(6,"JESUS ARE YOU CRAZY! ",post6.getId(),user1.getId());
    Comment comment7 = new Comment(7,"nahhhhh  now WAY BRO!!",post7.getId(),user2.getId());
      // the post ID then the DESCRIPTION of the post Then the post ID then the USER who made the comments

    // System.out.println("-----------------USER 1--------------------");
    // System.out.println(user1);
    // System.out.println(post1);
    // System.out.println(comment1);
    // System.out.println("-----------------USER 2--------------------");
    // System.out.println(user2);
    // System.out.println(post2);
    // System.out.println(comment2);
    // System.out.println("-----------------USER 3--------------------");
    // System.out.println(user3);
    // System.out.println(post3);
    // System.out.println(comment3);
    // System.out.println("-----------------USER 4--------------------");
    // System.out.println(user1);
    // System.out.println(post1);
    // System.out.println(comment4);
    // System.out.println(comment7);
    // System.out.println("-----------------USER 5--------------------");
    // System.out.println(user1);
    // System.out.println(post1);
    // System.out.println(comment5);
    // System.out.println("-----------------USER 6--------------------");
    // System.out.println(user1);
    // System.out.println(post1);
    // System.out.println(comment6);
    
    System.out.println("--------List of Users---------");

    List<User> users = List.of(user1,user2,user3,user4,user5);
    System.out.println("Users: " +  users);
    // users.forEach(user -> {
    //     System.out.println("User:"+ users);
    // });

    System.out.println("--------List of Posts---------");
    List<Post> posts = List.of(post1,post2,post3,post4,post5,post6,post7);
    System.out.println("Posts:" +  posts);

    System.out.println("--------List of Comments---------");
    List<Comment> comments = List.of(comment1,comment2,comment3,comment4,comment5,comment6,comment7);
    System.out.println("Comments: " +  comments);

    System.out.println("-----------------Gather individual data---------------");


    System.out.println("----------How many posts each user had-------------");
    System.out.println("-------------USER 1-------------");
    List<Post> postOfUser1 = getPostOfUsers(user1.getId(),posts);
    System.out.println("User1 posts: " + postOfUser1 );

    System.out.println("-------------USER 2-------------");
    List<Post> postOfUser2 = getPostOfUsers(user2.getId(),posts);
    System.out.println("User2 posts: " + postOfUser2 );

    System.out.println("-------------USER 3-------------");
    List<Post> postOfUser3 = getPostOfUsers(user3.getId(),posts);
    System.out.println("User3 posts: " + postOfUser3 );

    System.out.println("-------------USER 4-------------");
    List<Post> postOfUser4 = getPostOfUsers(user4.getId(),posts);
    System.out.println("User4 posts: " + postOfUser4 );

    System.out.println("-------------USER 5-------------");
    List<Post> postOfUser5 = getPostOfUsers(user5.getId(),posts);
    System.out.println("User5 posts: " + postOfUser5 );

    System.out.println("----------All the comments by individual post-------------");
    System.out.println("-------------POST 1-------------");
    List<Comment> post1Comments = getPostsComments(post1.getId(),comments); 
    System.out.println("Post1 has these comments: " + post1Comments );

    System.out.println("-------------POST 2-------------");
    List<Comment> post2Comments = getPostsComments(post2.getId(),comments); 
    System.out.println("Post2 has these comments: " + post2Comments );

    System.out.println("-------------POST 3-------------");
    List<Comment> post3Comments = getPostsComments(post3.getId(),comments); 
    System.out.println("Post3 has these comments: " + post3Comments );

    System.out.println("-------------POST 4-------------");
    List<Comment> post4Comments = getPostsComments(post4.getId(),comments); 
    System.out.println("Post4 has these comments: " + post4Comments );

    System.out.println("-------------POST 5-------------");
    List<Comment> post5Comments = getPostsComments(post5.getId(),comments); 
    System.out.println("Post5 has these comments: " + post5Comments );

    System.out.println("-------------POST 6-------------");
    List<Comment> post6Comments = getPostsComments(post6.getId(),comments); 
    System.out.println("Post6 has these comments: " + post6Comments );

    System.out.println("-------------POST 7-------------");
    List<Comment> post7Comments = getPostsComments(post7.getId(),comments); 
    System.out.println("Post7 has these comments: " + post7Comments );

    System.out.println("----------ALL comments that a user has recieved-------------");
    List<Comment> user1Comments = getUsersComments(user1.getId(),comments);
    System.out.println("Post7 has these comments: " + user1Comments );


      
  }

  // i am using filter so that i am looking for each user to get their userId
  // and looking for there post that they uploaded
  private static List<Post> getPostOfUsers(Integer userId, List<Post> posts){
    List<Post> userPosts = posts.stream().filter(post -> post.getUserId() == userId).collect(Collectors.toList());
  
    return userPosts;
  }
  private static List<Comment> getPostsComments(Integer postId, List<Comment> comments){
    List<Comment> postsComments = comments.stream().filter(comment -> comment.getPostId() == postId).collect(Collectors.toList());

    return postsComments;
  }

  private static List<Comment> getUsersComments(Integer userId, List<Comment> comments){
    List<Comment> usersComments = comments.stream().filter(comment -> comment.getUserId() == userId).collect(Collectors.toList());
    return usersComments;
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
