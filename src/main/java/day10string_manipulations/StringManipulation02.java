package day10string_manipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        /*

        Example: Check the given password if it meets the following conditions:

        // it shouldn't be empty
        // it shouldn't contain just space characters, there must be other characters as well
        // it shouldn't contain starting and ending spaces


        NOTE: use isEmpty() or isBlank() method
         */

        /*

        String s = "";
        System.out.println("s.isEmpty() = " + s.isEmpty()); // true
        System.out.println("s.isBlank() = " + s.isBlank()); // true

        String str = " ";
        System.out.println("str.isEmpty() = " + str.isEmpty()); // false
        System.out.println("str.isBlank() = " + str.isBlank());  // true => because space is considered invisible value

         */

        String pwd = "  abc  ";

        // it shouldn't be empty
        // boolean firstCondition = pwd.isEmpty(); // false because our string has values in it

        boolean firstCondition = !pwd.isEmpty();  // true
        System.out.println("firstCondition = " + firstCondition);


        // it shouldn't contain just space characters, there must be other characters as well
        // String pwd = "    ";  // isBlank will be true if the String had spaces only
        // String pwd = "  abc  "; // isBlank will be false because our String has other values too

        boolean secondCondition = !pwd.isBlank();
        System.out.println("secondCondition = " + secondCondition);


        // it shouldn't contain starting and ending spaces
        // String pwd = "  abc  ";  => trimmed pwd => "abc"
        // NOTE: trim() method removes ONLY the beginning and ending spaces

        boolean thirdCondition = pwd.trim().equals(pwd);
        System.out.println("thirdCondition = " + thirdCondition);

        if (!firstCondition){
            System.out.println("Password shouldn't be empty!");
        }

        if (!secondCondition){
            System.out.println("Password shouldn't just contain space characters");
        }

        if (!thirdCondition){
            System.out.println("Password shouldn't contain starting and ending spaces");
        }







    }
}
