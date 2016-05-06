package entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Properties;

public class ChocolateCandy extends Candy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ChocolateType typeOfChocolate;

	
	
	public ChocolateCandy() {
		super();
		this.init();
	}

	public ChocolateType getTypeOfChocolate() {
		return this.typeOfChocolate;
	}

	public void setTypeOfChocolate(ChocolateType typeOfChocolate) {
		this.typeOfChocolate = typeOfChocolate;
	}

	private void init() {
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("resources\\ChocolateCandy.properties")) {
			prop.load(input);
			this.name = prop.getProperty("name");
			this.typeOfChocolate = ChocolateType.valueOf(prop.getProperty("typeOfChocolate"));
			this.weight = Integer.parseInt((String) prop.getProperty("weight"));
			this.sugarAmount = Integer.parseInt((String) prop.getProperty("sugarAmount"));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public String toString() {
		return "ChocolateCandy [typeOfChocolate=" + typeOfChocolate + ", name=" + name + ", weight=" + weight
				+ ", sugarAmount=" + sugarAmount + "]";
	}
	
}
