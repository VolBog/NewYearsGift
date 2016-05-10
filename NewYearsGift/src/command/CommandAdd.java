package command;

import org.apache.log4j.Logger;

import entity.Caramel;
import entity.ChocolateCandy;
import entity.GiftBox;
import view.View;

/*
 * Command for add to gift box candy
 */
public class CommandAdd implements Command {
	private final static Logger LOG = Logger.getLogger(View.class);

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox gift = req.getValue();
		if (req.getParametr().equals("CARAMEL")) {
			gift.addCandy(new Caramel("1"));
			LOG.info("Add new candy caramel");
		} else if (req.getParametr().equals("CHOCO")) {
			gift.addCandy(new ChocolateCandy("1"));
			LOG.info("Add new Chocolate");
		} else if (req.getParametr().equals("NUTS")) {
			gift.addCandy(new Caramel("2"));
			LOG.info("Add new NUTS");
		} else if (req.getParametr().equals("MILKY")) {
			gift.addCandy(new ChocolateCandy("2"));
			LOG.info("Add new Chocolate");
		}
		return gift;
	}

}
