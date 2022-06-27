public class User {
    private String name;
    private String lastName;
    private Integer age;
    private String state;

    public User(){

    }

    public User(String name,String lastName,Integer age,String state){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
    }
    public String getFirstName(){
        return name;
    }

    public void setFirstName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    // Method Overwriting = OOP concept
    public String toString(){
    return "{ firstname: " + name 
    + " | lastName: " + lastName
    + " | age: " + age
    + " | state: " + state
    + " }";
    }

    
}
