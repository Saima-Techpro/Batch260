package day24encapsulation_oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student std = new Student();


        System.out.println("Name = " + std.getName()); // Henry
        System.out.println("Age = " + std.getAge());  // 17
        System.out.println("isSuccess = " + std.isSuccess());  // true

        std.setName("Anisa");
        std.setAge(14);
        std.isSuccess(true);

        System.out.println("Updated Name = " + std.getName());
        System.out.println("Updated Age = " + std.getAge());  // 14
        System.out.println("Updated isSuccess = " + std.isSuccess());  // true

    }
}
