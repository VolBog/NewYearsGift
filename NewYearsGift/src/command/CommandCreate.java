package command;

import org.apache.log4j.Logger;

import entity.Color;
import entity.GiftBox;
import view.View;
/*
 * Command for create gift box
 */
public class CommandCreate implements Command {
	private final static Logger LOG = Logger.getLogger(View.class);

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox gift = null;
		try {
			if (req.getParametr() != null) {
				gift = new GiftBox(Color.valueOf(req.getParametr()));
				LOG.info("Create new GiftBox with color");
			} else {
				gift = new GiftBox();
				LOG.info("Create new GiftBox");
			}
		} catch (Exception e) {
			LOG.error(e);
		}
		return gift;
	}

}
