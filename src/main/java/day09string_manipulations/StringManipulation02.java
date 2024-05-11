package day09string_manipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        /*
        Example: Calculate the total price of the products below:
                    tv: $458.90  , laptop: $788.99

                    NOTE: prices are given in String data type
         */

        String tv = "$458.90";
        String laptop = "$788.99";

        tv = tv.replace("$", "");
        System.out.println("after replacing $ = " + tv); // 458.90

         laptop = laptop.replace("$", "");
        System.out.println("after replacing $ = " + laptop); // 788.99

        //System.out.println(tv + laptop); // cocatenation, Mathematical operation can not be done between two string values

        // double => primitive  or Double => Wrapper class ??
        // primitive data type has values ONLY. We need a method to extract the numerical values out of String
        // So we will use Wrapper class
         Double tvPrice = Double.valueOf(tv);
         Double laptopPrice = Double.valueOf(laptop);

         Double totalPrice = tvPrice + laptopPrice;
        System.out.println("Total Price = $" + totalPrice);
        System.out.println("Total Price = $" + Math.round(totalPrice));


    }
}
