package day19methodcreation_overloading;

public class Varargs01 {
    public static void main(String[] args) {
        /*

        Varargs => Variable Arguments
        If we want to make number of parameters flexible, we create varargs
        To create varargs, we use 'dataType + ... + space + nameOfVariable

        varargs work in Array structure as the background
        varargs can be used for primitives and non-primitives

        RULES:
        1) More than one variable can be used in method that has varargs.
           But varargs should ALWAYS be declared as LAST parameter.
        2) varargs can accept zero or single element
        3) varargs can accept unlimited number of elements


         */

        System.out.println(sum());
        System.out.println(sum(2));
        System.out.println(sum(2, 5));
        System.out.println(sum(2, 5, 8, 9, 21));


    }

    public static int sum(int... a){
       int sum =0;

       for (int w: a){
           sum = sum +w;
       }
       return sum;
    }









}
