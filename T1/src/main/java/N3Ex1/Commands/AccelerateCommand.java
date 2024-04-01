package N3Ex1.Commands;

import N3Ex1.Parking.Vehicle;

public class AccelerateCommand implements Command{
    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
    vehicle.accelerate();
    }

}
