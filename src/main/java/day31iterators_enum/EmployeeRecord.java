package day31iterators_enum;


public final record EmployeeRecord(String name, int employeeNumber) {

    // records can NOT extend to any other class
    // they implicitly extend to record class (no multiple inheritance in Java)
    // However you can implement any interface
    // all records are final by default
    // Records have Canonical constructor however you can create your own too if you need to do some sort of validation of values (if statements etc.)
    // compact constructor => parameters removed, assignments removed
    public static final String DEFAULT_EMPLOYEE_NAME = "Jerry"; // can create / define static fields

    // private String address = "NY, US"; // can NOT define instance fields like this
    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    public static void print(){
        System.out.println("printing....");
    }
}

// https://docs.oracle.com/en/java/javase/14/language/records.html
// https://www.youtube.com/watch?v=gJ9DYC-jswo
