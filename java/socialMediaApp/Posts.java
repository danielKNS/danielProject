public class Posts {

    private Integer id;
    private String text;
    

    // all args Contructor
    public Posts(Integer id, String text){
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
        return " Id: " + id 
        + " Description: " + text;
    }
}
