import java.util.List;

public class User2 {

    private Integer id;// primary key - unique id/ key of the object that should not be shared.
    private String userName;
    private String lastName;
    private String email;
    private List<Post2> posts;

    // all args Contructor
    public User2(Integer id, String userName,String lastName, String email,List<Post2> posts){
        this.id = id;
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
        this.posts = posts;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public List<Post2> getPosts(){
        return posts;
    }

    public void setPosts(List<Post2> posts){
        this.posts = posts;
    }

    public String toString(){
        return "{"
        + " id:" + id 
        + " userName:" + userName
        + " lastName:" + lastName
        + " email:" + email
        + " posts: " + posts
        + " }";
    }
    
}
