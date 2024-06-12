package day26interfaces;

public class Runner {
    public static void main(String[] args) {

        // Let's try creating an object from interface
        // Brake brakeObj = new Brake(); // because interfaces don't have constructors

        // We can create object through normal concrete child class
        AudiA5 a5 = new AudiA5();

        a5.abs();
        a5.digital();
        a5.run();  // for now in our example, this method runs fine.
        // But in some complex projects/structure, methods with same names
        // can cause confusion. We have a way to deal with that.

        ((Engine)a5).run();

        Toyota toyota = new Toyota();
        toyota.run();

        System.out.println("price variable from AirCond interface: "+AirCond.price);

        System.out.println(Engine.price);

        Brake.speed();  // can call this method through Interface because it is 'static'

        a5.power(); // this method can be called through object only because it is not 'static'

    }
}
