package javapractice.miniproject3;

public class Manager extends FullTimeEmployee{
    // Manager class inheriting from FullTimeEmployee (Multilevel Inheritance)

    // Constructor to initialize manager attributes
    public Manager(String name, String id, double salary, double bonus, double benefits) {
        super(name, id, salary, bonus, benefits); // Call to FullTimeEmployee constructor
    }

    // Method specific to managers
    public void manageTeam() {
        System.out.println(getName() + " is managing the team.");
    }

    // Override calculateSalary to add a 10% bonus for managerial role
    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.10; // Manager gets a 10% additional salary
    }

    // Override method to provide details specific to managers
    @Override
    public String getDetails() {
        return "Manager: " + getName() + ", ID: " + getId() + ", Total Salary (with Managerial Bonus): " + calculateSalary();
    }


}
