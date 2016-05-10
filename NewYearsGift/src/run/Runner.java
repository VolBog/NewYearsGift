package run;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;
import view.View;

public class Runner {
	static {
		new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		View view = new View();
		view.startMenu();
	}
}
