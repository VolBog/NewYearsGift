package entity;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.*;

public class GiftBox implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7589181502018317340L;
	
	
	private Color colorBox;
	private List candies = new ArrayList<>();

	public GiftBox(){}

	public GiftBox(Color color) {
		super();
		this.colorBox = color;
	}

	public Color getColor() {
		return colorBox;
	}

	public void setColor(Color color) {
		this.colorBox = color;
	}

	public boolean addCandy(Candy candy){
		return candies.add(candy);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Box color: %s", getColor());
	}
	
}
