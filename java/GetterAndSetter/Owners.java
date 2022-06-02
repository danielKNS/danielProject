import java.util.List;

public class Owners{
    private String name ;
    private String email;
    private Integer password;

    public Owners(String name , String email , Integer password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

   
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Integer getPassword(){
        return password;
    }

    public void setPassword(Integer password){
        this.password = password;
    }
};