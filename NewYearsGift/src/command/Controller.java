package command;

import entity.GiftBox;

public class Controller {
	
	public GiftBox doRequest(Commands command, Request request) {
        return  CommandFactory.getCommand(command).doRequest(request);
    }
	
}
