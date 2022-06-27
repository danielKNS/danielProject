public class User {
    private String firstName;
    private String lastName;
    private Integer age;
    private String state;
    public User(String firstName,String lastName,Integer age,String state){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
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
    return "{ firstname: " + firstName 
    + " | lastName: " + lastName
    + " | age: " + age
    + " | state: " + state
    + " }";
    }

    
}
