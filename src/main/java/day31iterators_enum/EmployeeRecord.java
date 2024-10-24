package day31iterators_enum;
public final record EmployeeRecord(String employeeName, int employeeNum) { // works like a parameterised constructor (called Canonical constructor)

    /*
          Notes about RECORDS in Java

       In Java, Records were introduced in Java 14 (Preview) and became a standard feature in
       Java 16. They are a concise way to create classes that are primarily used to hold data.

     - all records are final by default
     - Record object are IMMUTABLE... can't be changed
     - Records don't allow setters (because they are IMMUTABLE)
     - Records can NOT extend to any other class
     - They implicitly extend to record class (no multiple inheritance in Java). However, you can implement any interface
     - Records allow to create / define static fields but not instance fields
     - Records allow to create non-static and static method


     Canonical constructor:

     - Records have Canonical constructor however you can create your own too if you need to do some sort of validation of values (if statements etc.)
     - compact constructor => parameters removed, assignments removed
     */


    /*
    This parameterised constructor is provided by default in Records. We don't have to create them
    They're called Canonical constructor.
    But you can override them. Remember the parameters have to be the exact same in overriding constructor


    parameterised constructor (called Canonical constructor)
     public EmployeeRecord(String employeeName, int employeeNum) {
        this.employeeName = employeeName;
        this.employeeNum = employeeNum;
    }
     */


    // overriding canonical constructor
//    public EmployeeRecord(String employeeName, int employeeNum){
//        if (employeeNum < 0){
//            throw new IllegalArgumentException("Employee number can't be negative.");
//        }
//        this.employeeName = employeeName;
//        this.employeeNum = employeeNum;
//    }

    // COMPACT CONSTRUCTOR - UNIQUE FEATURE OF RECORDS
    // remove the parameters and assignments, and you get COMPACT CONSTRUCTOR

    public EmployeeRecord{
        if (employeeNum < 0){
            throw new IllegalArgumentException("Employee number can't be negative.");
        }
    }

    public static final String DEFAULT_EMPLOYEE_NAME = "Jerry"; // can create / define static fields

    // private String address = "NY, US"; // can NOT define instance fields like this

    public String nameInUpperCase(){ // non-static method
        return employeeName.toUpperCase();
    }

    public static void print(){ //static method
        System.out.println("printing....");
    }

}


// https://docs.oracle.com/en/java/javase/14/language/records.html
// https://www.youtube.com/watch?v=gJ9DYC-jswo
