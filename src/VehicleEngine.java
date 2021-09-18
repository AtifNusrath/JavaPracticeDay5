import java.io.*;

interface Vehicle {
    void start();
    void stop();
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Car implements Vehicle{

    int speed;
    int gear;

    @Override
    public void start() {
        System.out.println("Starting Car Engine....");
    }

    @Override
    public void stop() {
        System.out.println("Stop Car Engine....");
    }

    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    @Override
    public void start() {
        System.out.println("Starting Bike Engine....");
    }

    @Override
    public void stop() {
        System.out.println("Stop Bike Engine....");
    }

    // to change gear
    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }

}
class VehicleEngine {

    public static void main (String[] args) {

        Car car = new Car();
        car.start();
        car.changeGear(2);
        car.speedUp(3);
        car.applyBrakes(1);

        System.out.println("Car present state :");
        car.printStates();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();
        bike.stop();
    }
}
