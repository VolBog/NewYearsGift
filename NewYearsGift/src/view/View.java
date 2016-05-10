package view;

import java.util.Scanner;

import command.Commands;
import command.Controller;
import command.Request;
import entity.Color;
import entity.GiftBox;

public class View {
	private GiftBox box;
	private Controller control = new Controller();
	private String[] parametrs = new String[10];

	public void startMenu() {
		System.out.println("Type a command");
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				Request request = null;
				parametrs = null;
				parametrs = sc.nextLine().split(" ");
				if (parametrs.length > 1) {
					request = new Request(box, parametrs[1]);
				} else {
					request = new Request(box);
				}
				box = control.doRequest(Commands.valueOf(parametrs[0]), request);

			} catch (Exception e) {
				System.out.println("Bad command");
			}

		}
	}

	public static void printBox(GiftBox gift) {
		System.out.println(gift);
	}

	public static GiftBox setBoxColor(GiftBox gift) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				gift.setColor(Color.valueOf(sc.next()));
				return gift;
			} catch (Exception e) {
				System.out.println("Bad command");
			}

		}
	}
}
