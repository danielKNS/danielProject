import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
public static void main(String[] args) {
    int n = 4;
        System.out.println("-----Employees-------");
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT);
        OffsetDateTime offsetDT1 = OffsetDateTime.of(1980,4,9,20,15,45,345875000,ZoneOffset.of("+07:00"));
        System.out.println(offsetDT1);
        Employee employee1 = new Employee("Roberto", 10,OffsetDateTime.of(2005,7,9,8,56,25,185875098,ZoneOffset.of("+06:00")));
        Employee employee2 = new Employee("Pablo", 34,OffsetDateTime.of(1983,4,9,10,15,15,945875123,ZoneOffset.of("+03:00")));
        Employee employee3 = new Employee("Jonas", 20,OffsetDateTime.of(1999,3,9,12,35,55,517975316,ZoneOffset.of("+08:00")));
        Employee employee4 = new Employee("Daniel", 17,OffsetDateTime.of(2000,5,18,21,11,50,365875000,ZoneOffset.of("+07:00")));
        Employee employee5 = new Employee("Carlos", 37,OffsetDateTime.of(1980,4,26,14,19,12,365875000,ZoneOffset.of("+07:00")));
        Employee employee6 = new Employee("Mathew", 21,OffsetDateTime.of(1998,8,12,23,19,45,365875000,ZoneOffset.of("+07:00")));
        Employee employee7 = new Employee("Andrew", 65,OffsetDateTime.of(1973,1,7,16,34,25,365875000,ZoneOffset.of("+07:00")));
        Employee employee8 = new Employee("Toby", 17,OffsetDateTime.of(2000,11,24,10,29,31,365875000,ZoneOffset.of("+07:00")));
        Employee employee9 = new Employee("Steven", 5,OffsetDateTime.of(2017,2,12,14,19,58,365875650,ZoneOffset.of("+07:00")));
        Employee employee10 = new Employee("Natalia", 80,OffsetDateTime.of(1940,9,8,22,14,35,365375000,ZoneOffset.of("+07:00")));

        
        List<Employee> employees = List.of(employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10);
         employees.forEach(employee -> {
                System.out.println("Employer: " + employee);
            });
        System.out.println("-----ORDER BY NAME------");
       List<Employee> sortededByName = employees.stream().sorted((employee00,employee90) -> employee00.getName().compareTo(employee90.getName())).collect(Collectors.toList());
       sortededByName.forEach(employee -> {
        System.out.println("Employer: " + employee);
       });
       System.out.println("------ORDER OF WHO IS THE YOUNGEST-----");
       List<Employee> sortedeByAge = employees.stream().sorted(Comparator.comparingInt(Employee :: getAge)).collect(Collectors.toList());
       sortedeByAge.forEach(employee -> {
        System.out.println("Employer: " + employee);
       });
       System.out.println("------ORDER OF WHO IS THE OLDEST-----");
       List<Employee> sortedeByWhoIsTheOldest = employees.stream().sorted(Comparator.comparing(Employee :: getBirthDay)).collect(Collectors.toList());
       sortedeByWhoIsTheOldest.forEach(employee -> {
        System.out.println("Employer: " + employee);
       });
    }
}
