package logic;

import entity.Color;
import entity.GiftBox;

public class Logic {
	
	public static GiftBox createBox(Color color){
		return new GiftBox(color);
	}
	
	
}
