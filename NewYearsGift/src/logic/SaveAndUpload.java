package logic;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import entity.GiftBox;

public class SaveAndUpload{
	


	public static void save(GiftBox box, String name){
		try{
			FileOutputStream file = new FileOutputStream(name + ".dat");
			ObjectOutputStream serial = new ObjectOutputStream(file);
			serial.writeObject(box);
			serial.flush();
		}catch(Exception e){
			
		}

	}

}
