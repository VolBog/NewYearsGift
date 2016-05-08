package command;

import entity.GiftBox;
/*
 * Request for command
 */
public class Request {
	private Commands command;
	private GiftBox value;
	private String parametr;

	public Request(GiftBox value, String parametr) {
		this(value);
		this.parametr = parametr;
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


	public String getParametr() {
		return parametr;
	}

	public void setParametr(String parametr) {
		this.parametr = parametr;
	}



}
