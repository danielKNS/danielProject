public class Owners{


    private String name ;
    private String email;
    private Integer password;
    private Boolean likeDog;


    public Owners(String name , String email , Integer password,Boolean likeDog){
        this.name = name;
        this.email = email;
        this.password = password;
        this.likeDog = likeDog;
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

    public Boolean getlikeDog(){
        return likeDog;
    }

    public void setLikeDog(Boolean likeDog){
        this.likeDog = likeDog;
    }

    public String toString(){
        return "name: " + name
        + " Email: " + email 
        + " Password: " + password
        + " Does the owner like a dog; " + likeDog
        ;
    }
};