package command;

import entity.Candy;
import entity.GiftBox;

public class CommandFind implements Command {

	@Override
	public GiftBox doRequest(Request req) {
		String[] minAndMax = req.getParametr().split("-");
		int min = Integer.parseInt(minAndMax[0]);
		int max = Integer.parseInt(minAndMax[1]);
		for(Candy can : req.getValue().getCandies()){
			if(can.getSugarAmount() >= min && can.getSugarAmount() <= max){
				System.out.println(can);
			}
		}
		return req.getValue();
	}

}
