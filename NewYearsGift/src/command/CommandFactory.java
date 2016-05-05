package command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory{
	private static final Map<Commands, Command> commands = new HashMap<>();
	
	static {
		commands.put(Commands.CREATE, new CommandCreate());
	}
	
	public static Command getCommand(Commands commandName) {
		return commands.get(commandName);
	}
}
