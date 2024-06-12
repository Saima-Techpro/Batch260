package day26interfaces;

public class Toyota implements Brake, Engine, AirCond{

    // override from Brake interface
    public void abs() {
        System.out.println("Toyota uses ABS braking system.");
    }

    public void esp(int a) {
        System.out.println("Toyota uses ESP braking system.");
    }

    // override from Engine interface
    public void eco(){
        System.out.println("Toyota uses eco engine.");
    }
    public void turbo(){
        System.out.println("Toyota uses turbo embedded in eco engine");
    }

    // override from AirCond interface
    public void digital() {
        System.out.println("Toyota uses digital ac control.");
    }

    public void run(){
        System.out.println("Toyota runs hybrid engine... ");
    }

}
