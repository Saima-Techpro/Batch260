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




    }
}
