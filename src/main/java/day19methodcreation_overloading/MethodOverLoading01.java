package day19methodcreation_overloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        /*
        POLYMORPHISM - It is one of the principles of OOP concepts.

        Polymorphism => Poly means multiple ; morphism means forms

        POLYMORPHISM =  Method OverLoading  +  Method OverRiding
                      (Static Polymorphism)     (Dynamic Polymorphism)

        Create a method and use it for different purposes  (by adding different datatypes or variable names).
        In Method Overloading, we modify the method parameters

        METHOD SIGNATURE => method name + method parameters
        In Method Overloading, method name remains the same, method parameters  change

        How to overload a method?
        1) We MUST keep the name of the method same
        2) We can change data type in method parameters
        3) We can change number of variable in method parameters
        4) We can change the place variable in method parameters

        NOTE: There is no importance in having return type, access modifier, or static  keyword

            Q: Can we overload private methods?
            A: Yes
            Q: Can we overload non-static methods?
            A: Yes

         */

        String s = "Hello wolrd";
        System.out.println(s.substring(2));  // llo wolrd
        System.out.println(s.substring(2, 6));  // llo

        System.out.println("========method call example========");
        // method call
        // method parameters change through data type
        System.out.println(add(2, 6));  // add() where both variables are int
        System.out.println(add(3, 5.5));  // add() where one variable is int, the other is double
        System.out.println(add(5.7, 9.9));  // add() where both variables are double
        System.out.println(add(3.4, 8));  // doesn't complain => 1st double, 2nd int  == type casting => so no complain

        // method parameters change through number of variables
        System.out.println(add(4, 6, 9));


    }


    private static int add(int a, int b){
        return a+b;
    }

    public static double add(int a, double b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(int a, int b, double c){
        return a+b+c;
    }

    public static double add(int a, double c, int b){
        return a+c+b;
    }
}
