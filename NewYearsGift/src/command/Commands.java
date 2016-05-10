package command;

public enum Commands {
	CREATE("Create new gift box"),
	PRINT("Print current gift box"),
	ADD("Add candy to gift box"),
	PRINTCANDY("Print all candy in gift box"), 
	SAVE("Save gift box to file"),
	LOAD("Load gift box from file"),
	SORT("Sort by weight or sugar amount"),
	FIND("Find Candy in current giftbox"),
	GENERATE("Generate new gift box"),
	HELP("Help");

	
	private final String command;

	private Commands(String command) {
		this.command = command;
	}

	public String getCommand() {
		return command;
	}
	
	
	
}
