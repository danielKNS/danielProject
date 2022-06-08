import java.util.List;
//the list of objects for each
public class Object{

    private List<User> users;
    private List<Post> posts;
    private List<Comment> comments;

    public Object(List<User> users,List<Post> posts,List<Comment> comments){
        this.users=users;
        this.posts=posts;
        this.comments=comments;
    }

    public String toString(){
        return "User: " + users
        + "Posts:" + posts
        + " Comments: " + comments;
    }
    
}