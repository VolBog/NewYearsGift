package command;

import java.io.FileNotFoundException;
import java.io.IOException;

import entity.Caramel;
import entity.ChocolateCandy;
import entity.GiftBox;

public class CommandAdd implements Command {

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox gift = req.getValue();
		if(req.getParametr().equals("CARAMEL")) {	
				gift.addCandy(new Caramel());
		}else if(req.getParametr().equals("CHOCO")){
			gift.addCandy(new ChocolateCandy());
		}
		return gift;
	}

}
