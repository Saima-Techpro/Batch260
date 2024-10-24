package day31iterators_enum;

public class Runner {

    public static void main(String[] args) {
        Employee employee = new Employee("Jake", 123);
        System.out.println("employee = " + employee); // toString()
        System.out.println(employee.getName());
        System.out.println(employee.getEmployeeNumber());


        EmployeeRecord employeeRecord = new EmployeeRecord("Emily", 456);

        System.out.println("employeeRecord = " + employeeRecord); // toString()
        System.out.println(employeeRecord.employeeName());  // (getter method works at the backend)
        System.out.println(employeeRecord.employeeNum());  //  (getter method works at the backend)

        System.out.println(employeeRecord.nameInUpperCase());
        EmployeeRecord.print(); // method call by class name coz print() is static

        // Immutable by default =>  setters not created
    }
}
