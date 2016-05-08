package command;

public enum Commands {
	CREATE("create"),
	PRINT("print"),
	SETBOXCOLOR("set"),
	ADD("add"),
	PRINTCANDY("printc"), 
	SAVE("save"),
	LOAD("load"),
	SORT("sort"),
	FIND("FIND"),
	GENERATE("generate");
//	COUNT_WEIGHT,
//	SAVE,
//	LOAD;
	
	
	private final String command;

	private Commands(String command) {
		this.command = command;
	}
	
}
