package command;

import entity.Candy;
import entity.GiftBox;

public class CommandPrintCandy implements Command{

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox gift = req.getValue();
		for(Candy cand : gift.getCandies()){
			System.out.println(cand);
		}
			
			
		return gift;
	}

}
