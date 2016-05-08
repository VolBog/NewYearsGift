package command;

import entity.GiftBox;
import view.View;

public class CommandPrint implements Command {

	@Override
	public GiftBox doRequest(Request req) {
		System.out.println(req.getValue());
		return req.getValue();
	}

}
