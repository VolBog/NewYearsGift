package run;


import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

import view.View;


public class Runner {
	static {
		new DOMConfigurator().doConfigure("config/log4j.xml",LogManager.getLoggerRepository());
	}
	
	public static void main(String[] args){
		
		View view = new View();
		view.startMenu();
		int menuItem = -1;
		while (menuItem == -1){
			menuItem = view.selectMenuItem();
		}
		view.itemMenu(menuItem);
	}
}
