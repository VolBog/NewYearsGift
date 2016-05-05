package command;

public class Request {
	private Commands command;
	private Object value;
	private int minValue;
    private int maxValue;
	
    public Request(Commands command, Object value, int minValue, int maxValue) {
		super();
		this.command = command;
		this.value = value;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public Request(Commands command, Object value) {
		super();
		this.command = command;
		this.value = value;
	}
    
    
}
