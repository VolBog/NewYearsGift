package command;

import java.util.Collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import entity.GiftBox;

public class CommandSort implements Command {

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox box = req.getValue();
		java.util.Collections.sort(box.getCandies(), (a, b) -> a.getWeight() - b.getWeight());
		return box;
	}

}
