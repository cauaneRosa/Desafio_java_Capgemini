package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao_2 {

	public static void main(String[] args) {
		senha("Ya3");
	}

	public static void senha(String senha) {

		Pattern num = Pattern.compile("\\d+");
		Matcher numero = num.matcher(senha);

		Pattern strMaisc = Pattern.compile("[A-Z]");
		Matcher strMaisculo = strMaisc.matcher(senha);

		Pattern strMinus = Pattern.compile("[a-z]");
		Matcher strMinusculo = strMinus.matcher(senha);

		Pattern chaEspec = Pattern.compile("[@!#$%^&*()/\\\\]");
		Matcher chaEspecial = chaEspec.matcher(senha);

		int total = 0;

		if (senha.length() >= 6) {
			if (numero.find()) {

			} else {
				//System.out.println("Precisa de numero");
				total = total + 1;
			}
			if (strMaisculo.find()) {

			} else {
				//System.out.println("Precisa de letra maiuscula");
				total = total + 1;
			}
			if (strMinusculo.find()) {

			} else {
				//System.out.println("Precisa de letra minuscula");
				total = total + 1;
			}
			if (chaEspecial.find()) {

			} else {
				//System.out.println("Precisa de Caract especial");
				total = total + 1;
			}

		} else {
			total = 6 - senha.length();
		}

		System.out.println(total);
	}
}