package command;

import org.apache.log4j.Logger;

import entity.GiftBox;
import view.View;

/*
 * Sort candy in giftbox
 */
public class CommandSort implements Command {
	private final static Logger LOG = Logger.getLogger(View.class);

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox box = req.getValue();
		if (req.getParametr().equals("weight")) {
			java.util.Collections.sort(box.getCandies(), (a, b) -> a.getWeight() - b.getWeight());
			LOG.info("SORT BY WEIGHT");
		} else {
			java.util.Collections.sort(box.getCandies(), (a, b) -> a.getSugarAmount() - b.getSugarAmount());
			LOG.info("SORT BY SugarAmount");
		}

		return box;
	}

}
