public class User {

    private Integer id;// primary key - unique id/ key of the object that should not be shared.
    private String userName;
    private String lastName;
    private String email;

    // all args Contructor
    public User(Integer id, String userName,String lastName, String email){
        this.id = id;
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
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

    public String toString(){
        return "{"
        + " id:" + id 
        + " userName:" + userName
        + " lastName:" + lastName
        + " email:" + email
        + " }";
    }
}
