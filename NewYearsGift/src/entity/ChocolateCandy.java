package entity;


import java.io.FileInputStream;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

import org.apache.log4j.Logger;

import view.View;

public class ChocolateCandy extends Candy implements Serializable {

	private final static Logger LOG = Logger.getLogger(View.class);
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
			LOG.error(e);
		}

	}

	@Override
	public String toString() {
		return String.format("Name: %s; weight: %d; shugar amount: %d; chocolate: %s;", 
				   getName(), getWeight(), getSugarAmount(), getTypeOfChocolate());
	}
	
}
