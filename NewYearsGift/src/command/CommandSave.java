package command;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import entity.GiftBox;

public class CommandSave implements Command {

	@Override
	public GiftBox doRequest(Request req) {
		 try(
			   
				FileOutputStream fout = new FileOutputStream("resources\\giftbox.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fout);  ){
			 
				oos.writeObject(req.getValue());
				System.out.println("Done");
				   
			   }catch(Exception ex){
				   ex.printStackTrace();
			   }
		return req.getValue();
	}

}
