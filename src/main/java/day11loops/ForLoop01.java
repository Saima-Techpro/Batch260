package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        // Put * between two consecutive characters and at the end of the String
        // Java => J*a*v*a*
        // When we work with strings, we use index.

        String str = "Java";

        for (int i=0; i < str.length(); i++){
            System.out.print(str.charAt(i) + "*");  // J*a*v*a*

        }

        System.out.println();
        System.out.println("======================");
        // Example: Print all the words before 'm' in the given String.
        // "wisdom" => "wisdo"  "Tram" => "Tra"   "Miami" => "Mia"

        String s = "Miami";

        for (int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'm'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("====================");

        // Example:  Print all the letters from a given String except lowercase
        // "Pwd123?Ab"  => "P123?A"
        // NOTE: 'continue' keyword is used to skip a data when the condition is met
        String s1 = "Pwd";

        for (int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z'){

                continue;  // is used to skip a data when the condition is met
            }
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("==================");

        // Interview Question => Reverse or Palindrome
        // Reverse the given String
        // "Java"  => "avaJ"

        String s2 = "ana";
        String reversedString = "";  /// to store the letters in reversed order

        for (int i= s2.length()-1; i>=0; i--){
            reversedString = reversedString + s2.charAt(i);
        }
        System.out.println(reversedString);

        if (s2.equals(reversedString)){
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is NOT a palindrome!");
        }

        System.out.println("==================");

        // HW: Reverse the name "Johnson"
        String name = "Johnson";
        String reversedName = "";
        for(int i = name.length()-1; i>=0; i--){
            char ch2 = name.charAt(i);
            reversedName = reversedName + ch2;
        }
        System.out.print(reversedName);

        System.out.println();



    }
}
