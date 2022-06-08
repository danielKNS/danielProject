import java.util.List;

public class Comment2 {
    
    private Integer id;// primary key
    private String text;
   
    

    // all args Contructor
    public Comment2(Integer id, String text){
        this.id = id;
        this.text = text;
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
