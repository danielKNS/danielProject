public class Post {

    private Integer id;// primary key
    private String text;
    private Integer userKey; // foreing key 
    

    // all args Contructor
    public Post(Integer id, String text){
        this.id = id ;
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

    public String toString(){
        return " id: " + id 
        + " text: " + text;
    }
}
