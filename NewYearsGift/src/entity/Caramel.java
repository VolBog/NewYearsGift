package entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Properties;

public class Caramel extends Candy implements Serializable {

	private Color color;
	private CaramelType type;
	
	
	public Caramel() {
		super();
		this.init();
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public CaramelType getType() {
		return this.type;
	}

	public void setType(CaramelType type) {
		this.type = type;
	}

	private void init() {
		Properties prop = new Properties();
		try (
				InputStream input = new FileInputStream("resources\\CARAMEL.properties")){
			prop.load(input);
			this.color = Color.valueOf(prop.getProperty("color"));
			this.name = prop.getProperty("name");
			this.type = CaramelType.valueOf(prop.getProperty("caramelType"));
			this.weight = Integer.parseInt((String) prop.getProperty("weight"));
			this.sugarAmount = Integer.parseInt((String) prop.getProperty("sugarAmount"));
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	public void saveProrpeties() {
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			//output = new FileOutputStream("CARAMEL.properties");

			// set the properties value
			prop.setProperty("name", "CARAMEL");
			prop.setProperty("weight", "5");
			prop.setProperty("sugarAmount", "5");
			prop.setProperty("color", "BLACK");
			prop.setProperty("caramelType", "CARAMEL_CANDY");
			File f = new File("resources\\CARAMEL.properties");
	        OutputStream out = new FileOutputStream( f );
	        prop.store(out, "This is an propertis of Caramel Candy");
			// save properties to project root folder
		
	        
	        

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("SAVE");
	}

	@Override
	public String toString() {
		return "Caramel [color=" + color + ", type=" + type + "]";
	}
	
}
