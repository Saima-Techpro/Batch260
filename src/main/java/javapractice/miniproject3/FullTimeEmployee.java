package javapractice.miniproject3;

public class FullTimeEmployee extends Employee{  // Full-time employee class inheriting from Employee

    private double bonus;   // Bonus specific to full-time employees
    private double benefits; // Benefits specific to full-time employees


    // Constructor to initialize full-time employee attributes
    public FullTimeEmployee(String name, String id, double salary, double bonus, double benefits) {
        super(name, id); // Call to the parent class constructor
        this.salary = salary; // Set base salary // Refers to the salary inherited from Employee
        this.bonus = bonus;   // Set bonus amount
        this.benefits = benefits; // Set benefits amount
    }
    /*
    In Java, the FullTimeEmployee class inherits from the Employee class.
    The Employee class has a protected double salary attribute. Since FullTimeEmployee is a subclass of Employee,
    it inherits this salary field from the parent class.

     This means that even though FullTimeEmployee does not declare a salary variable explicitly, it has access to
     the salary field through inheritance.
     this.salary refers to the inherited salary:

     The 'this' keyword in Java refers to the current instance of the class (in this case, an instance of FullTimeEmployee).
     Since FullTimeEmployee inherits the salary field from Employee, this.salary is a reference to the salary field
     in the Employee class, not in FullTimeEmployee itself.
     The assignment this.salary = salary; ensures that the salary field inherited from Employee gets initialized
     with the value passed into the FullTimeEmployee constructor.
     */

    // Override the abstract method to calculate full-time employee salary
    @Override
    public double calculateSalary() {
        return salary + bonus + benefits; // Full-time salary = base salary + bonus + benefits
    }

    // Override method to provide details specific to full-time employees
    @Override
    public String getDetails() {
        return "Full-time Employee: " + getName() + ", ID: " + getId() + ", Total Salary: " + calculateSalary();
    }
}
