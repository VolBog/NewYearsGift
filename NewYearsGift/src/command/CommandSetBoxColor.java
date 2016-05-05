package command;

import entity.GiftBox;
import view.View;

public class CommandSetBoxColor implements Command{

	@Override
	public GiftBox doRequest(Request req) {
		
		return View.setBoxColor(req.getValue());
	}

}
