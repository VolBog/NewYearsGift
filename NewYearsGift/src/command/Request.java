package command;

import entity.GiftBox;

public class Request {
	private Commands command;
	private GiftBox value;
	private int minValue;
    private int maxValue;
	
    public Request(GiftBox value, int minValue, int maxValue) {
		super();
		this.command = command;
		this.value = value;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public Request(GiftBox value) {
		super();
		this.value = value;
	}

	public Commands getCommand() {
		return command;
	}

	public void setCommand(Commands command) {
		this.command = command;
	}

	public GiftBox getValue() {
		return value;
	}

	public void setValue(GiftBox value) {
		this.value = value;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
    
    
}
