package javapractice.miniproject3;

// ContractEmployee class inheriting from Employee
class ContractEmployee extends Employee {
    private double contractRate; // Rate for contract employees
    private int contractLength;  // Length of the contract in months

    // Constructor to initialize contract employee attributes
    public ContractEmployee(String name, String id, double contractRate, int contractLength) {
        super(name, id); // Call to the parent class constructor
        this.contractRate = contractRate;
        this.contractLength = contractLength;
    }

    // Override the abstract method to calculate contract employee salary
    @Override
    public double calculateSalary() {
        // Check if contract length is valid
        if (contractLength < 0 || contractLength > 24) {
            System.out.println("Invalid contract length!");
            return 0;
        }
        return contractRate * contractLength; // Salary = contract rate * length of contract
    }

    // Override method to provide details specific to contract employees
    @Override
    public String getDetails() {
        return "Contract Employee: " + getName() + ", ID: " + getId() + ", Total Payment: " + calculateSalary();
    }
}