package javapractice.miniproject3;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        // Creating instances of various employees

        // Full-time employee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice Johnson", "F001", 60000, 5000, 2000);
        System.out.println(fullTimeEmployee.getDetails());

        // Part-time employee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob Smith", "P001", 20, 100);
        System.out.println(partTimeEmployee.getDetails());

        // Manager
        Manager manager = new Manager("Carol Williams", "M001", 80000, 7000, 3000);
        System.out.println(manager.getDetails());
        manager.manageTeam(); // Call manager-specific method

        // Intern
        Intern intern = new Intern("David Brown", "I001", 1500, 6);
        System.out.println(intern.getDetails());

        // Contract employee
        ContractEmployee contractEmployee = new ContractEmployee("Eve Davis", "C001", 4000, 12);
        System.out.println(contractEmployee.getDetails());
    }
}
