package N3Ex1;

import N3Ex1.Commands.Command;

import java.util.ArrayList;
import java.util.List;

    public class Invoker {

        private static List<Command> commandList;

        public Invoker() {
            commandList = new ArrayList<>();
        }

        public void addCommand(Command command){
            commandList.add(command);
        }

        public void executeCommands(){
            commandList.forEach(Command::execute);
        }



}
