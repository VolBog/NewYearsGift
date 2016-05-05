package view;

import java.util.Scanner;

import entity.Color;
import entity.GiftBox;

public class View {
	private GiftBox box;
	
	public void startMenu() {
		System.out.println("Select a menu item");
		for(ItemMenu item : ItemMenu.values()) {
			System.out.println(item.ordinal() + 1 + ") " + item.getKey());
		
		}
	}
	
	public int selectMenuItem(){
		Scanner sc = new Scanner(System.in);
		try{
			return sc.nextInt() - 1;
		}catch(Exception e){// add Logger Later
			System.out.println("Wrong number");
		}
		return -1;
	}
	public void itemMenu(int item){
		switch (item) {
		case 0:
			System.out.println(this.createGifBox());
			break;

		default:
			break;
		}
	}
	public GiftBox createGifBox(){
		System.out.println("select color of Box");
		return new GiftBox(this.selectColor());
	}
	
	public Color selectColor(){
		for(Color col : Color.values()){
			System.out.println(col.ordinal() + 1 + ") " + col);
		}
		Scanner sc = new Scanner(System.in);
		int colorId = -1;
		while(colorId == -1){
			try{
				colorId = sc.nextInt() - 1;
			}catch(Exception e){
				System.out.println("Wrong number");
			}
			if(colorId < 0 || colorId > Color.values().length){
				colorId = -1;
				System.out.println("Wrong number");
			}
		}
		return Color.values()[colorId - 1];
	}
}
