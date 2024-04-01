package N3Ex1.Parking;

public class Bicycle extends Vehicle{
    public Bicycle(String name, int price, String color) {
        super(name, price, color);
    }

    @Override
    public void accelerate() {
        System.out.println("Bike " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " accelerates");
    }

    @Override
    public void startUp() {
        System.out.println("Bike " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " starts up");
    }

    @Override
    public void brake() {
        System.out.println("Bike " + this.name + ", that costs " + this.price + " euros, of color " + this.color + " is braking");
    }
}
