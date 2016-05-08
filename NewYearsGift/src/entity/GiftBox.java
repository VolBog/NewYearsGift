package entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import view.View;

import java.io.Serializable;
import java.util.*;

public class GiftBox implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7589181502018317340L;
	private final static Logger LOG = Logger.getLogger(View.class);

	private Color colorBox;
	private List<Candy> candies = new ArrayList<>();
	private int weight = 0;

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			LOG.error("Weight is not < 0");
		}
	}

	public GiftBox() {
	}

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

	public boolean addCandy(Candy candy) {
		this.weight += candy.getWeight();
		return candies.add(candy);
	}

	public List<Candy> getCandies() {
		return candies;
	}

	public void setCandies(List<Candy> list) {
		this.candies = list;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Box color: %s and weight is %s", getColor(), getWeight());
	}

	public int getWeight() {
		return weight;
	}

}
