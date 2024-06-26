package day31exceptions;

public class InvalidStudentGradeException extends Exception{
    // by establishing inheritance, we ensure that this class serves as an exception

    public InvalidStudentGradeException(String message){ // constructor

        super(message);

    }
}
