package N3Ex1.Parking;

public class Car extends Vehicle{
    public Car(String name, int price, String color) {
        super(name, price, color);
    }

    @Override
    public void accelerate(){
        System.out.println("Car " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " accelerates");
    }
    @Override
    public void startUp(){
        System.out.println("Car " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " starts up");

    }
    @Override
    public void brake(){
        System.out.println("Car " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " is braking");

    }
}
