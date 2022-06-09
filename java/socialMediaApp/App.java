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

      //.size for each function
    System.out.println("----------How many posts each user had-------------");
    System.out.println("-------------USER 1-------------");
    List<Post> postOfUser1 = getPostOfUsers(user1.getId(),posts);
    Integer totalPost1 = postOfUser1.size();
    System.out.println("User1 posts: " + totalPost1 );

    System.out.println("-------------USER 2-------------");
    List<Post> postOfUser2 = getPostOfUsers(user2.getId(),posts);
    Integer totalPost2 = postOfUser2.size();
    System.out.println("User2 posts: " + totalPost2);

    System.out.println("-------------USER 3-------------");
    List<Post> postOfUser3 = getPostOfUsers(user3.getId(),posts);
    Integer totalPost3 = postOfUser3.size();
    System.out.println("User3 posts: " + totalPost3 );

    System.out.println("-------------USER 4-------------");
    List<Post> postOfUser4 = getPostOfUsers(user4.getId(),posts);
    Integer totalPost4 = postOfUser4.size();
    System.out.println("User4 posts: " + totalPost4 );

    System.out.println("-------------USER 5-------------");
    List<Post> postOfUser5 = getPostOfUsers(user5.getId(),posts);
    Integer totalPost5 = postOfUser5.size();
    System.out.println("User5 posts: " + totalPost5 );

    System.out.println("----------All the comments by individual post-------------");
    System.out.println("-------------POST 1-------------");
    List<Comment> post1Comments = getPostsComments(post1.getId(),comments); 
    Integer totalPostsComments1 = post1Comments.size();
    System.out.println("Post1 has these comments: " + totalPostsComments1 );

    System.out.println("-------------POST 2-------------");
    List<Comment> post2Comments = getPostsComments(post2.getId(),comments); 
    Integer totalPostsComments2 = post2Comments.size();
    System.out.println("Post2 has these comments: " + totalPostsComments2 );

    System.out.println("-------------POST 3-------------");
    List<Comment> post3Comments = getPostsComments(post3.getId(),comments);
    Integer totalPostsComments3 = post3Comments.size(); 
    System.out.println("Post3 has these comments: " + totalPostsComments3 );

    System.out.println("-------------POST 4-------------");
    List<Comment> post4Comments = getPostsComments(post4.getId(),comments); 
    Integer totalPostsComments4 = post4Comments.size();
    System.out.println("Post4 has these comments: " + totalPostsComments4 );

    System.out.println("-------------POST 5-------------");
    List<Comment> post5Comments = getPostsComments(post5.getId(),comments); 
    Integer totalPostsComments5 = post5Comments.size();
    System.out.println("Post5 has these comments: " + totalPostsComments5 );

    System.out.println("-------------POST 6-------------");
    List<Comment> post6Comments = getPostsComments(post6.getId(),comments); 
    Integer totalPostsComments6 = post6Comments.size();
    System.out.println("Post6 has these comments: " + totalPostsComments6 );

    System.out.println("-------------POST 7-------------");
    List<Comment> post7Comments = getPostsComments(post7.getId(),comments); 
    Integer totalPostsComments7 = post7Comments.size();
    System.out.println("Post7 has these comments: " + totalPostsComments7 );

    System.out.println("----------ALL comments that a user has recieved on any post-------------");
    System.out.println("-------------USER 1 COMMENTS-------------");
    List<Comment> user1Comments = getUsersComments(user1.getId(),comments);
    Integer totalUsersComments1 = user1Comments.size();
    System.out.println("These are User1 comments: " + totalUsersComments1 );

    System.out.println("-------------USER 2 COMMENTS-------------");
    List<Comment> user2Comments = getUsersComments(user2.getId(),comments);
    Integer totalUsersComments2 = user2Comments.size();
    System.out.println("These are User2 comments: " + totalUsersComments2 );

    System.out.println("-------------USER 3 COMMENTS-------------");
    List<Comment> user3Comments = getUsersComments(user3.getId(),comments);
    Integer totalUsersComments3 = user3Comments.size();
    System.out.println("These are User2 comments: " + totalUsersComments3 );

    System.out.println("-------------USER 4 COMMENTS-------------");
    List<Comment> user4Comments = getUsersComments(user3.getId(),comments);
    Integer totalUsersComments4 = user4Comments.size();
    System.out.println("These are User2 comments: " + totalUsersComments4 );

    System.out.println("-------------USER 5 COMMENTS-------------");
    List<Comment> user5Comments = getUsersComments(user3.getId(),comments);
    Integer totalUsersComments5 = user5Comments.size();
    System.out.println("These are User2 comments: " + totalUsersComments5 );

    System.out.println("------------ALL the comments a user has recieved on ANY of their posts--------------");

    System.out.println("-------------USER 1 RECIEVED COMMENTS-------------");
    //i am getting postOfUser1(user1 posts) and i am checking for each user1 posts 
    //and i am getting ALL commonts that is in ALL in his post
    postOfUser1.forEach(post -> {
      List<Comment> user1PostComments = getUsersPostsComments(post.getId(),comments);
      System.out.println("These are the comments that User1 recieved in all of his posts: " + user1PostComments);
    });

    System.out.println("-------------USER 2 RECIEVED COMMENTS-------------");
    postOfUser2.forEach(post -> {
      List<Comment> user2PostComments = getUsersPostsComments(post.getId(),comments);
      System.out.println("These are the comments that User2 recieved in all of his posts: " + user2PostComments);
    });

    System.out.println("-------------USER 3 RECIEVED COMMENTS-------------");
    postOfUser3.forEach(post -> {
      List<Comment> user3PostComments = getUsersPostsComments(post.getId(),comments);
      System.out.println("These are the comments that User3 recieved in all of his posts: " + user3PostComments);
    });

    System.out.println("-------------USER 4 RECIEVED COMMENTS-------------");
    postOfUser4.forEach(post -> {
      List<Comment> user4PostComments = getUsersPostsComments(post.getId(),comments);
      System.out.println("These are the comments that User4 recieved in all of his posts: " + user4PostComments);
    });

    System.out.println("-------------USER 5 RECIEVED COMMENTS-------------");
    postOfUser5.forEach(post -> {
      List<Comment> user5PostComments = getUsersPostsComments(post.getId(),comments);
      System.out.println("These are the comments that User5 recieved in all of his posts: " + user5PostComments);
    });


    System.out.println("------------ALL the posts that each indivisual user comented on--------------");
    System.out.println("-------------USER 1 POST HE COMMENTED -------------");
    List<Post> user1PostCommented = getAllPostUsersCommented(user1.getId(), posts);
    System.out.println("all the post user 1 commented on: " +user1PostCommented);


  }

  // i am using filter so that i am looking for each user to get their userId
  // and looking for there post that they uploaded
  private static List<Post> getPostOfUsers(Integer userId, List<Post> posts){
    List<Post> userPosts = posts.stream().filter(post -> post.getUserId() == userId)
      .collect(Collectors.toList());
  
    return userPosts;
  }
  private static List<Comment> getPostsComments(Integer postId, List<Comment> comments){
    List<Comment> postsComments = comments.stream().filter(comment -> comment.getPostId() == postId)
      .collect(Collectors.toList());

    return postsComments;
  }

  private static List<Comment> getUsersComments(Integer userId, List<Comment> comments){
    List<Comment> usersComments = comments.stream().filter(comment -> comment.getUserId() == userId)
      .collect(Collectors.toList());

    return usersComments;
  }

  private static List<Comment> getUsersPostsComments(Integer postId, List<Comment> comments){
    List<Comment> usersPostsComments = comments.stream().filter(comment -> comment.getPostId() == postId)
      .collect(Collectors.toList());

      return usersPostsComments;
  }

  private static List<Post> getAllPostUsersCommented(Integer userId ,List<Post> posts){
      List<Post> allPostUsersCommented = posts.stream().filter(post -> post.getUserId() == userId)
      .collect(Collectors.toList());

      return allPostUsersCommented;
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
