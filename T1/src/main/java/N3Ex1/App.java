package N3Ex1;

import N3Ex1.Commands.AccelerateCommand;
import N3Ex1.Commands.BrakeCommand;
import N3Ex1.Commands.StartUpCommand;
import N3Ex1.Parking.*;

public class App {
    public static void main(String[] args) {

        Car car = new Car("Renault", 42323, "red");
        Bicycle bike = new Bicycle("Speedy", 234, "pink");
        Airplane airplane = new Airplane("Boing234", 2453425, "white");

        StartUpCommand startUpAirplane = new StartUpCommand(airplane);
        AccelerateCommand accelerateBike = new AccelerateCommand(bike);
        BrakeCommand brakeCar = new BrakeCommand(car);

        handleCommands(startUpAirplane, accelerateBike, brakeCar);
    }
        public static void handleCommands(StartUpCommand startUpAirplane, AccelerateCommand accelerateBike, BrakeCommand brakeCar) {

            Invoker invoker = new Invoker();

            invoker.addCommand(startUpAirplane);
            invoker.addCommand(accelerateBike);
            invoker.addCommand(brakeCar);

            invoker.executeCommands();

        }

}
