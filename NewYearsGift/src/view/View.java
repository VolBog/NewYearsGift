package view;

import java.util.Scanner;

import command.Commands;
import command.Controller;
import command.Request;
import command.Response;
import entity.Color;
import entity.GiftBox;

public class View {
	private GiftBox box;
	private Controller control = new Controller();

	public void startMenu() {
		System.out.println("Type a command");
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				Request request = new Request(box);
				box = control.doRequest(Commands.valueOf(sc.next()), request);

			} catch (Exception e) {
				System.out.println("Помилка введення");
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
				return 	gift;
			} catch (Exception e) {
				System.out.println("Помилка введення");
			}

		}
	}
}
