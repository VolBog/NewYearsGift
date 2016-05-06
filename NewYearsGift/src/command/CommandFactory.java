package command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory{
	private static final Map<Commands, Command> commands = new HashMap<>();
	
	static {
		commands.put(Commands.CREATE, new CommandCreate());
		commands.put(Commands.PRINT, new CommandPrint());
		commands.put(Commands.SETBOXCOLOR, new CommandSetBoxColor());
		commands.put(Commands.ADD, new CommandAdd());
		commands.put(Commands.PRINTCANDY, new CommandPrintCandy());
		commands.put(Commands.SAVE, new CommandSave());
		commands.put(Commands.LOAD, new CommandLoad());
		commands.put(Commands.SORT, new CommandSort());
		commands.put(Commands.FIND, new CommandFind());
		
	}
	
	public static Command getCommand(Commands commandName) {
		return commands.get(commandName);
	}
}
