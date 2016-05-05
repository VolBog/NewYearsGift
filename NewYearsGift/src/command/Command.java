package command;

import entity.GiftBox;

public interface Command {
	GiftBox doRequest(Request req);
}
