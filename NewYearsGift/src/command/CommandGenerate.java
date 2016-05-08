package command;

import java.util.Random;

import org.apache.log4j.Logger;

import entity.Color;
import entity.GiftBox;
import entity.ListOfCandies;
import view.View;

public class CommandGenerate implements Command {
	private final static Logger LOG = Logger.getLogger(View.class);

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox gift = null;
		int weightOfGift = 0;
		int pick = new Random().nextInt(Color.values().length); // pick random color 
		try{
			gift = new GiftBox(Color.values()[pick]);
			
			LOG.info("Generate gift box");
		}catch(Exception e){
			LOG.error(e);
		}
		try{
			weightOfGift = Integer.parseInt(req.getParametr());
		}catch(NumberFormatException e){
			LOG.error(e);
		}
		if(weightOfGift > 0){
			CommandAdd add = new CommandAdd();
			System.out.println(weightOfGift);
			while(gift.getWeight() <= weightOfGift){
				System.out.println(gift.getWeight());
				pick = new Random().nextInt(ListOfCandies.values().length);
				req.setParametr(ListOfCandies.values()[pick].toString());
				req.setValue(gift);
				gift = add.doRequest(req);
			}
		}
		return gift;
	}

}
