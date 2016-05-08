package command;

import entity.GiftBox;
/*
 * Return the class from command
 */
public class Controller {
	
	public GiftBox doRequest(Commands command, Request request) {
        return  CommandFactory.getCommand(command).doRequest(request);
    }
	
}
