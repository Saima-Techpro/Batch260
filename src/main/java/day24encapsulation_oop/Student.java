package day24encapsulation_oop;

public class Student {

    /*
        - Encapsulation is the 3rd characteristic of OOP concept
        - Encapsulation is intended for the protection and hiding of data.

        How can a data be encapsulated?
        By making access modifier "private". Data will be hidden from all other classes.

        How can we read the encapsulated data?
        By creating getter method, we can read the encapsulated data.
        By creating setter method, we can update the encapsulated data.

        1)	By using encapsulation, we can define read(getter) and write(setter) properties separately.

        2) We can grant read access to some, and write access to others.
        ***Some people should only see the information but not change it.
        ***Some people should see the information as well as change it.


        NOTES:
        - setters do NOT update the original data. The update happens in the object class
        - setters do not generate new data; they just modify the existing data.
           That's why setters are 'void' methods
        - setters take parameters to assign new values to existing encapsulated data.
        - getters and setters both are generally non-static
     */

    private String name = "Henry";
    private int age = 17;
    private boolean isSuccess = true;

    // we use getter() method to allow access for read-only

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    // we use setter() method to allow updates/changes

    public void setName(String name){
       this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void isSuccess(boolean success) {
        isSuccess = success;
    }
}
