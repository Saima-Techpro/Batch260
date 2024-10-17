package javapractice.miniproject3;

public abstract class Employee {  // Abstract class representing a generic Employee

    // Private variables encapsulate employee information
    private String name; // Name of the employee
    private String id;   // Unique employee ID
    protected double salary; // Protected so subclasses can access salary

    // Constructor to initialize the common employee properties
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method for salary calculation, to be implemented by subclasses
    public abstract double calculateSalary();

    // Getter for employee name (Encapsulation)
    public String getName() {
        return name;
    }

    // Getter for employee ID (Encapsulation)
    public String getId() {
        return id;
    }

    // Abstract method to get employee details, implemented by subclasses
    public abstract String getDetails();
}
