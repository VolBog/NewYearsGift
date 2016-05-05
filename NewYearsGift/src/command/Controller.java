package command;

public class Controller {
	
	public Response doRequest(Commands comand, Request request) {
        return  CommandFactory.getCommand(comand).doRequest(request);
    }
	
}
