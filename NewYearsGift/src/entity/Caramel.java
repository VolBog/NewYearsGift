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

import org.apache.log4j.Logger;

import view.View;

public class Caramel extends Candy implements Serializable {
	private final static Logger LOG = Logger.getLogger(View.class);
	private Color color;
	private CaramelType type;
	private final static String PATH = "resources\\caramel\\";

	public Caramel() {
		super();
		this.init("1"); // INIT parameters from file
	}
	public Caramel(String initParametr) {
		this.init(initParametr); // INIT parameters from file
	}
	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public CaramelType getCaramelType() {
		return type;
	}

	public CaramelType getType() {
		return this.type;
	}

	public void setType(CaramelType type) {
		this.type = type;
	}

	private void init(String initParam) {
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream(PATH + initParam + ".properties")) {
			prop.load(input);
			this.color = Color.valueOf(prop.getProperty("color"));
			this.name = prop.getProperty("name");
			this.type = CaramelType.valueOf(prop.getProperty("caramelType"));
			this.weight = Integer.parseInt((String) prop.getProperty("weight"));
			this.sugarAmount = Integer.parseInt((String) prop.getProperty("sugarAmount"));
		} catch (Exception e) {
			LOG.error(e);
		}

	}

	@Override
	public String toString() {
		return String.format("Name: %s; weight: %d; shugar amount: %d; color: %s; Caramel type: %s", getName(),
				getWeight(), getSugarAmount(), getColor(), getCaramelType());
	}

}
