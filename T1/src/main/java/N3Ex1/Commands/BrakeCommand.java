package N3Ex1.Commands;

import N3Ex1.Parking.Vehicle;

public class BrakeCommand implements Command{

    private Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.brake();
    }

}
