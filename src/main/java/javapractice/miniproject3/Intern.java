package javapractice.miniproject3;

public class Intern extends Employee{ // Intern class inheriting from Employee

    private double stipend; // Fixed stipend for interns
    private int duration;   // Duration of internship in months

    // Constructor to initialize intern attributes
    public Intern(String name, String id, double stipend, int duration) {
        super(name, id); // Call to the parent class constructor
        this.stipend = stipend;
        this.duration = duration;
    }

    // Override the abstract method to calculate intern salary (fixed stipend)
    @Override
    public double calculateSalary() {
        // Check if duration is valid
        if (duration < 0 || duration > 12) {
            System.out.println("Invalid internship duration!");
            return 0;
        }
        return stipend; // Salary for interns is their stipend
    }

    // Override method to provide details specific to interns
    @Override
    public String getDetails() {
        return "Intern: " + getName() + ", ID: " + getId() + ", Stipend: " + calculateSalary();
    }
}
