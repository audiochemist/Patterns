package N1Ex1;

import N1Ex1.Exceptions.EmptyCommadList;
import N1Ex1.Exceptions.NoCommandsFound;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> commands;

    private Undo(){
        this.commands = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command){
        commands.add(command);
        System.out.println("Command successfully added");
    }

    public void removeCommand(String command) throws NoCommandsFound {
        int index = searchCommand(command);
        if (index == -1) {
            throw new NoCommandsFound("This command was not found");
        }else {
            commands.remove(index);
        }
    }

    public int searchCommand(String command){
        int foundIndex = -1;
        boolean coincidence = false;
        int i = 0;

        while (i < commands.size() && !coincidence) {
            if ((commands.get(i).equalsIgnoreCase(command))){
                coincidence = true;
                foundIndex = i;
            }
            i++;
        }

        return foundIndex;
    }

    public void showCommands() throws EmptyCommadList {
        if (commands.isEmpty()){
            throw new EmptyCommadList("There is no command history");
        }else {
            for (String command : commands) {
                System.out.println("\n" + command);
            }
        }
    }

}




