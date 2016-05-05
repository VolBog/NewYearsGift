package command;

import org.apache.log4j.Logger;

import entity.GiftBox;


public class CommandCreate implements Command{
	//private final static Logger LOG = Logger.getLogger(Reporter.class);
	@Override
	public GiftBox doRequest(Request req) {
		GiftBox gift = null;
		try{
			gift = new GiftBox();
		}catch(Exception e){
			//LOG.error(e);
		}
		return gift;
	}

}
