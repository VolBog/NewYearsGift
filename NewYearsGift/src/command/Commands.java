package command;

public enum Commands {
	CREATE("create"),
	PRINT("print"),
	SETBOXCOLOR("set");
//	ADD,
//	FIND_BY_SHUGAR_AMOUNT,
//	COUNT_WEIGHT,
//	SAVE,
//	LOAD;
	
	
	private final String command;

	private Commands(String command) {
		this.command = command;
	}
	
}
