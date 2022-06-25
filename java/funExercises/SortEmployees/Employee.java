import java.sql.Date;
import java.time.OffsetDateTime;

public class Employee {
    private String name ;
    private Integer age;
    private OffsetDateTime birthday;

    public Employee(String name, Integer age, OffsetDateTime birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public OffsetDateTime getBirthDay(){
        return birthday;
    }

    public void setBirthDay(OffsetDateTime birthday){
        this.birthday = birthday;
    }


    // Method Overwriting = OOP concept
    public String toString(){
        return "{ name: " + name 
        + " | age: " + age
        + " | birthday: " + birthday
        + " }";
    }
}
