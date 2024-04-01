package N3Ex1.Parking;

public class Ship extends Vehicle {
    public Ship(String name, int price, String color) {
        super(name, price, color);
    }

    @Override
    public void accelerate() {
        System.out.println("Ship " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " accelerates");
    }

    @Override
    public void startUp() {
        System.out.println("Ship " + this.name + ", that costs " + this.price + " euros, of color " + this.color + "is starting up");

    }

    @Override
    public void brake() {
        System.out.println("Ship " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " is braking");

    }

}
