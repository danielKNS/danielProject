import java.util.List;
//the list of objects for each
public class Object{

    private List<Users> users;
    private List<Posts> posts;
    private List<Comments> comments;

    public Object(List<Users> users,List<Posts> posts,List<Comments> comments){
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