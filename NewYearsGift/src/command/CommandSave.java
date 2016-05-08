package command;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

import entity.GiftBox;
import view.View;

public class CommandSave implements Command {
	private final static Logger LOG = Logger.getLogger(View.class);
	private final static String PATCH = "resources\\giftbox.ser";

	@Override
	public GiftBox doRequest(Request req) {
		try (FileOutputStream fout = new FileOutputStream(PATCH);
				ObjectOutputStream oos = new ObjectOutputStream(fout);) {

			oos.writeObject(req.getValue());
			LOG.info("Save giftbox to file");

		} catch (Exception ex) {
			LOG.error(ex);
		}
		return req.getValue();
	}

}
