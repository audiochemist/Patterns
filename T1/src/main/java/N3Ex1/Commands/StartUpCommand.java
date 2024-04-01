package N3Ex1.Commands;

import N3Ex1.Parking.Vehicle;

public class StartUpCommand implements Command {

    private Vehicle vehicle;

    public StartUpCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.startUp();
    }


}
