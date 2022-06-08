public class Post {

    private Integer id;// primary key
    private String text;
    private Integer userId; // foreing key 
    

    // all args Contructor
    public Post(Integer id, String text,Integer userId){
        this.id = id ;
        this. text = text;
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

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(Integer userId){
        this.userId= userId;
    }

    public String toString(){
        return "{ id: " + id 
        + " | text: " + text
        + " | userId: " + userId
        + " }";
    }
}
