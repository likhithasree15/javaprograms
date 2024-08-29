package cse;
class Person {
    String fName;
    String lastName;

    public Person(String fName, String lastName) {
        this.fName = fName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return fName;
    }
    public String getLastName() {
        return lastName;
    }
}
class Employee extends Person {
    String employeeId;
    String jobTitle;
    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}
public class employees{
    public static void main(String[] args) {
        Employee emp = new Employee("John", "Doe", "E12345", "Software Engineer");
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}

