package main;

import java.util.ArrayList;

public class Questao_1 {

	public static void main(String[] args) {
		escada(6);
	}

	public static void escada(int x) {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < x; i++) {
			list.add(" ".repeat(x - i - 1) + "*".repeat(i + 1));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
