package javapractice.miniproject3;

public class PartTimeEmployee extends Employee{ // Part-time employee class inheriting from Employee

    private double hourlyRate; // Hourly rate for part-time employees
    private int hoursWorked;   // Hours worked by the part-time employee

    // Constructor to initialize part-time employee attributes
    public PartTimeEmployee(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id); // Call to the parent class constructor
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override the abstract method to calculate part-time employee salary
    @Override
    public double calculateSalary() {
        // Check if hours worked is within valid range
        if (hoursWorked < 0 || hoursWorked > 40) {
            System.out.println("Invalid number of hours entered!");
            return 0;
        }
        return hourlyRate * hoursWorked; // Salary = hourly rate * hours worked
    }

    // Override method to provide details specific to part-time employees
    @Override
    public String getDetails() {
        return "Part-time Employee: " + getName() + ", ID: " + getId() + ", Total Salary: " + calculateSalary();
    }
}
