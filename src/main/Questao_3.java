package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Questao_3 {

	public static void main(String[] args) {
		escada("ifailuhkqq");
	}

	public static void escada(String s) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		char r, b;
		int num = 0;

		char[] a = s.toCharArray();

		int indice = 0;
		int indice2 = 1;
		String texto = "";
		String texto2 = "";
		for (int i = 0; i < a.length; i++) {
			indice2 = i + 1;
			r = s.charAt(i);
			String retorno = Character.toString(r);

			texto = texto.concat(Character.toString(s.charAt(i)));

			list2.add(texto);
			int j = i + 1;
			for (int q = j; q < a.length; q++) {
				indice = indice + 1;

				b = s.charAt(q);
				String res2 = Character.toString(b);
				if (indice < a.length) {
					texto2 = texto2.concat(Character.toString(s.charAt(indice)));

					list.add(texto2);

				}
				if (retorno.equals(res2)) {
					num = num + 1;
				}
			}

			if (indice2 == a.length) {

				for (int x = 0; x < list.size(); x++) {
					char[] val = list.get(x).toCharArray();
					char[] val2 = list2.get(x).toCharArray();
					Arrays.sort(val);
					Arrays.sort(val2);
					String SortedString2 = new String(val);
					String SortedString = new String(val2);
					if (SortedString.equals(SortedString2)) {

						num = num + 1;
					}

				}

			}

		}
		System.out.println(num);

	}
}
