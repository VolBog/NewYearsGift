package view;

public enum ItemMenu {
	CREATEBOX("Create gift box");
	
	
	
	private String key;
	
	
	ItemMenu(String key){
		this.key = key;
	}
	
	String getKey(){
		return key;
	}
}
