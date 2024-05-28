package day19methodcreation_overloading;

public class Example {
    public static void main(String[] args) {

//        System.out.println("add = " + add(3, 5)); // error => because we can't reach the non-static methods without Class instance
//        printText("Hello Wolrd!"); // error => because we can't reach the non-static methods without Class instance

        // So we need to create Class instance first,  so we can access the non-static methods
        // If we want to reach methods or variables without creating object, we should use 'static' keyword

        Example example = new Example();
        System.out.println("example.add(3, 5) = " + example.subtract(3, 5));

        // NOTE:  non-static members belong to objects; static members belong to classes directly

//        String str = new String();  // create an object/instance of the class to reach out to its method
//        System.out.println(str.substring(0));

    }


    // non-static methods

    public int subtract(int a, int b){
        return  a-b;
    }


    public void printText(String s){  // if a method doesn't create a new data, then we use void return type
        System.out.println(s);
    }


}
