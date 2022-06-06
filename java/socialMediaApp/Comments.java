public class Comments {

    private Integer id;
    private String text;
    

    // all args Contructor
    public Comments(Integer id, String text){
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
        return " Id: " + id 
        + " Comments: " + text;
    }
}
