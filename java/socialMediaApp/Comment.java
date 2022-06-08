public class Comment {

    private Integer id;// primary key
    private String text;
    private Integer postId;// foreing key 
    private Integer userId;// foreing key that points to the user.id primary key,tells us who comments
    

    // all args Contructor
    public Comment(Integer id, String text,Integer postId,Integer userId){
        this.id = id;
        this. text = text;
        this.postId = postId;
        this.userId = userId;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text= text;
    }

    public Integer getPostId(){
        return postId;
    }

    public void setPostId(Integer postId){
        this.postId= postId;
    }


    public Integer getUserId(){
        return userId;
    }

    public void setUserId(Integer userId){
        this.userId= userId;
    }

    // Method Overwriting = OOP concept
    public String toString(){
        return " id: " + id 
        + " comments: " + text;
    }
}
