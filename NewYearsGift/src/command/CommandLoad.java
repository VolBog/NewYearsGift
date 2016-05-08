package command;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import entity.GiftBox;
import view.View;

public class CommandLoad implements Command{
	private final static Logger LOG = Logger.getLogger(View.class);
	private final static String PATCH = "resources\\giftbox.ser";
	@Override
	public GiftBox doRequest(Request req) {
		
		GiftBox gift = null;
		try(
			      InputStream file = new FileInputStream(PATCH);
			      InputStream buffer = new BufferedInputStream(file);
			      ObjectInput input = new ObjectInputStream (buffer);
			    ){
				gift =(GiftBox) input.readObject();
			      LOG.info("GiftBox load from file");
			    }
			    catch(IOException ex){
			    	LOG.error(ex);
			    } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					LOG.error(e);
				}
		
		return gift;
	}
	
}
