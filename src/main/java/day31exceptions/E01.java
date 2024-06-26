package day31exceptions;

public class E01 {
    public static void main(String[] args) {
        /*
                 finally block

    1) The 'finally block' is commonly used for;
    a) Releasing resources: (disconnecting database connections, using the close() method),
       Especially before Java 7, resources like database connections had to be closed manually.
       Such resources, if left open for too long, would occupy unnecessary space in the system
       and could lead to potential performance issues.
       This became automated post-Java 7 (with the try-with-resources statement).

    b) Closing files: (we had just made a file connection. it could be closed with fis.close();)
      It's necessary to close files after reading or writing operations are done. Otherwise,
      file handles unnecessarily occupy space in the system.

    c) Cleanup operations that must run in all cases:
      (Some operations, whether successful or not, should always be performed at the end of a certain process.
      For example, logging the start and end times of each operation to a log file. With BufferedWriter)

         */
        int a = 3;
        int b = 0;
        String[] s = {"Java", "is", "easy"};

        // method call
        getElement(s, a, b);
    }

    public static void getElement(String[] s, int a, int b){

        try {
            int idx = a / b;
            String element = s[idx];
            System.out.println("element = " + element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index doesn't exist in the given length");
        }catch (ArithmeticException e){
            System.out.println("The problem is: "+ e.getMessage()); // / by zero
        }finally { // works everytime when the code is executed
            System.out.println("Cut the connection with the database.");
        }

        System.out.println("Hello again!");

    }

    /*
    - multiple finally is not allowed. can be used once.
    - try + catch  || try + multiple catch || try + catch + finally || try + finally => all variations are available....
    - multiple catch is ok but multiple finally is not.
    - try + finally is ok.

     */






}
