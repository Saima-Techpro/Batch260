package day31iterators_enum;

import java.util.Objects;

public class Employee {
    private final String name;
    private final int employeeNumber;

    public Employee(String name, int employeeNumber){
       this.name = name;
       this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", EmployeeNumber=" + employeeNumber +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, employeeNumber);
    }

    // To check one instance is equal to another or not
    @Override
    public boolean equals(final Object o){
        if (this == o){
            return true;
        }
        if (o == null){
            return false;
        }
        if (getClass() != o.getClass()){
            return false;
        }

        Employee employee = (Employee) o;

        return Objects.equals(employeeNumber, employee.employeeNumber) &&
                Objects.equals(name, employee.name);
    }




}
