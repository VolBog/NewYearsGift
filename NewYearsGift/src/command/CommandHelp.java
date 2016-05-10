package command;

import entity.GiftBox;

public class CommandHelp implements Command{

	@Override
	public GiftBox doRequest(Request req) {
		for (Commands c : Commands.values()) {
		    System.out.println(c + ":" + c.getCommand());
		}
		return req.getValue();
	}

}
