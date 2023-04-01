public class Vehicle {
    void drive(){
        System.out.println("Driving!");
    }
    void vehiclebreak(){
        System.out.println("Breaks");
    }
    void reverse(){
        System.out.println("Reverse!");
    }
}
class Car extends Vehicle{
    void motorRacing(){
        System.out.println("Racing!");
    }
}
class ModernCar extends Car{
    void flying(){
        System.out.println("flying!");
    }
}
class Boat extends Vehicle{
    void surf(){
        System.out.println("surfing!");
    }
}
class ModernBoat extends Boat{
    void landridding(){
        System.out.println("Ridding!");
    }
}
class TestOutput{
    public static void main(String[] args) {
        ModernCar mc = new ModernCar();
        ModernBoat mb = new ModernBoat();
        mc.drive();
        mc.vehiclebreak();
        mc.reverse();
        mc.motorRacing();
        mc.flying();
        mb.drive();
        mb.vehiclebreak();
        mb.reverse();
        mb.surf();
        mb.landridding();

    }

}

