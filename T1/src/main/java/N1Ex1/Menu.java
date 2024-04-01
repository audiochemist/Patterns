package N1Ex1;

import N1Ex1.Exceptions.EmptyCommadList;
import N1Ex1.Exceptions.NoCommandsFound;

public class Menu {
    private static Undo commands = Undo.getInstance();
    public static void start() {
        int menuOption;
        do {
            System.out.println("\nMenu:" +
                    "\n0. Exit app" +
                    "\n1. Add command" +
                    "\n2. Remove command" +
                    "\n3. Show commands");
            menuOption = Input.readInt();
            switch (menuOption) {
                case 0:
                    System.out.println("Goodbye");
                    break;
                case 1:
                    System.out.println("Please add a command");
                    commands.addCommand(Input.readString());
                    break;
                case 2:
                    System.out.println("Enter the command you would like to remove");
                    try {
                        commands.removeCommand(Input.readString());
                    } catch (NoCommandsFound e) {
                        System.err.println("Error: " + e.getMessage() + "\nPlease search for a valid command");
                    }
                    break;
                case 3:
                    try {
                        commands.showCommands();
                    }catch (EmptyCommadList e){
                        System.err.println("Error: " + e.getMessage() + "\nPlease wait until there's a command");
                    }
                    break;
            }

        } while (menuOption != 0);
    }


}
