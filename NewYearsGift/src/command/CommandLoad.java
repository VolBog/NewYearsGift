package command;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.apache.log4j.Level;

import entity.GiftBox;

public class CommandLoad implements Command{

	@Override
	public GiftBox doRequest(Request req) {
		GiftBox gift = null;

		try(
			      InputStream file = new FileInputStream("resources\\giftbox.ser");
			      InputStream buffer = new BufferedInputStream(file);
			      ObjectInput input = new ObjectInputStream (buffer);
			    ){
			      //deserialize the List
				gift =(GiftBox) input.readObject();
			      //display its data
			      
			    }
			    catch(ClassNotFoundException ex){
			     // fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.", ex);
			    }
			    catch(IOException ex){
			 //     fLogger.log(Level.SEVERE, "Cannot perform input.", ex);
			    }
		
		return gift;
	}
	
}
