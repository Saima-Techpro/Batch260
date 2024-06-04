package day21passbyvalue_stringbuilder;

public class StringBuilder03 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java is object-oriented language.");

        System.out.println(sb);

        sb.replace(0, 5, "Python ");  // replace() is used to replace text with the given String
                                            // where starting index is inclusive, and ending index is exclusive
                                            // 3rd parameter is String that you want to replace
        System.out.println(sb);

        sb.deleteCharAt(0);  // deletes the character at the given index
        System.out.println(sb);  // ython is object-oriented language.

        sb.delete(0, 6); // deletes the character(s) between the given indexes where starting index is inclusive, and ending index is exclusive
        System.out.println(sb); // is object-oriented language.

        sb.insert(3, "SalesForce ");  // insert() skips the given number of index, and add the String after that. it doesn't remove anything.
        System.out.println(sb);  // is SalesForce object-oriented language.

        // Difference between replace() and insert()?
        // replace() method removes the string from the given indexes
        // insert() method does NOT remove the string from the given indexes, Just adds the new String

        sb.reverse();  // it reverses the given String  => reverse() does NOT exist in String data type
        System.out.println(sb); // .egaugnal detneiro-tcejbo ecroFselaS si

        // compareTo() method returns int value.
        // It checks the ASCII values of the characters
        // If the two StringBuilder objects are equal, it returns 0.
        // If the first StringBuilder object comes before the second, it returns negative value showing the difference between the characters on ASCII Chart
        // If the first StringBuilder object comes AFTER the second, it returns positive value showing the difference between the characters on ASCII Chart

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Lava");
        int result = sb1.compareTo(sb2);
        System.out.println("result = " + result);  // -2


    }
}
