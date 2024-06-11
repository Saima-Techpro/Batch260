package day25abstraction_oop;

public class Civic extends Honda {

    @Override
    public void music() {
        System.out.println("Pro system for Civic.");
    }

    public void engine(){
        System.out.println("Engine power 2.5");
    }

    /*
    If there's a parent child relation between an "abstract" class and a "normal" class,
    child class will show an error until and unless the abstract method is implemented.
    So implementation of abstract method is "mandatory".
     */




}
