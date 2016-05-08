package command;

import entity.Candy;
import entity.GiftBox;

public class CommandFind implements Command {

	@Override
	public GiftBox doRequest(Request req) {
		String[] minAndMax = req.getParametr().split("-");
		int min = 0;
		int max = 0;
		if(minAndMax.length > 1){
		min = Integer.parseInt(minAndMax[0]);
		max = Integer.parseInt(minAndMax[1]);
		}else if(minAndMax.length == 1){
			min = Integer.parseInt(minAndMax[0]);
			max = min;
		}
		for(Candy can : req.getValue().getCandies()){
			if(can.getSugarAmount() >= min && can.getSugarAmount() <= max){
				System.out.println(can);
			}
		}
		return req.getValue();
	}

}
