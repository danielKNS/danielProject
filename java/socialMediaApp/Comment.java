public class Comment {

    private Integer id;// primary key
    private String text;
    private Integer postId;// foreing key 
    private Integer userId;// foreing key that points to the user.id primary key,tells us who comments
    

    // all args Contructor
    public Comment(Integer id, String text){
        this.id = id;
        this. text = text;
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

    // Method Overwriting = OOP concept
    public String toString(){
        return " id: " + id 
        + " comments: " + text;
    }
}
