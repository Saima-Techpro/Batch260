package day31exceptions;

public class CustomException {
    public static void main(String[] args)  {

        /*
        You can create your own custom exception classes.
        Typically, this is done by extending the Exception class or a more specific child class.

        There are several reasons for creating your own exception classes:

        1- Customized Exception Messages: With your custom exception classes,
        you can create more meaningful and detailed error messages for a specific error condition.

        2- Better Error Management: By creating different exception classes for different types of errors,
        catching and managing these errors becomes easier. Custom exceptions allow you to catch and manage errors more specifically.
        (For example, you can throw an error for entering a negative age in a school app.)

        3- Defining Business Rules: Some business rules cannot be directly represented with standard Java exceptions.
        By creating special exceptions for these rules, you can better define your business rules.
        (For Java, there is no difference between entering a negative or positive age. It would matter if it were division by zero.)
        */
        /*
        4- More Meaningful Logging: With your customized exception classes, you can have more specific information about why an error occurred
        and store this information in logs.

        For example, if you have an application where users below a certain age cannot register,
        you could create a special exception to indicate this situation.

         */

        //grade(-56);

        System.out.println(checkNameFormat("Ali"));
        System.out.println(checkNameFormat("veli")); // IllegalNameException => a custom exception created by us

    }


    public static void grade(int grade) {
        if (grade<0 || grade>100 ){
            try {
                throw new InvalidStudentGradeException("Grade can't be less than 0 or more than 100.");

            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }

        }else {
            System.out.println(grade);
        }
    }

    // Ensure student names must start with Uppercase

    public static boolean checkNameFormat(String name){
        if (name.charAt(0) >= 'A' &&  name.charAt(0)<= 'Z'){
            return true;
        }else {
            throw new IllegalNameException("Names must start with Uppercase");

        }
    }







}
