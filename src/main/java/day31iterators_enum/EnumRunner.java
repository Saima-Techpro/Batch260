package day31iterators_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        /*
        1) The data in the enum are constants.
        2) You cannot create a new object from the enum using the new keyword.
        3) This is because each constant data you put into the enum works with the logic of an object created from this class.
        4) Each constant we put inside the enum is by default public, static, and final.
            (Here, provinces are implied - when defining an enum, you don't need to and cannot write these keywords in front of the constants; the syntax of the language does not support this.)
        5) Therefore, you can access each constant data inside the enum by writing the enum name.
        6) The constructor in the enum is not used to create a new object, but to initialize the variables inside each constant data in the enum.


         */
        // Cities  c1 = new Cities; // We can't create object from enums
        // Reach out to any constant in Cities enum
        Cities c1 = Cities.ANKARA;
        System.out.println("c1 = " + c1);

        // Reach out to the values inside this constant
        String cityName = Cities.ANKARA.getCityName();
        System.out.println("cityName = " + cityName);

        int plateCode = Cities.BURSA.getPlateCode();
        System.out.println("Bursa plateCode = " + plateCode);

        String postalCode = Cities.İSTANBUL.getPostalCode();
        System.out.println("Istanbul postalCode = " + postalCode);

        // Ask user to enter a plate code to find related city name.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the plate code please.");
        int userPlateCode = scan.nextInt();

        Cities[] allValues = Cities.values();
        // System.out.println("allValues = " + Arrays.toString(allValues));

        if (userPlateCode < 1 || userPlateCode>81){
            System.out.println("Invalid plate code");
        }else {

            for (Cities w:allValues){

                // System.out.println(w.getCityName());
                if (userPlateCode == w.getPlateCode()){


                    System.out.println("This plate code belongs to "+w.getCityName() + " city.");
                }
            }

        }

    }
}
