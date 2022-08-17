package application;

import entitites.Financing;

public class Program {

	public static String formatCoin(double value) {
		return String.format("%.2f",value);
	}

	public static void main(String[] args) {

		try {
			Financing fin1 = new Financing(5000.0, 200000.00, 20);
			System.out.println(fin1);
			System.out.println("Dados do financiamento:");
			System.out.println("Entrada: " + formatCoin(fin1.entry()));
			System.out.println("Parcela: " + formatCoin(fin1.quota()));
			System.out.println("Renda mensal: " + formatCoin(fin1.getIncome()));

		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage());
		}

		try {
			Financing fin2 = new Financing(5000.0, 200000.00, 80);
			System.out.println(fin2);
			System.out.println("Dados do financiamento:");
			System.out.printf("Entrada: %.2f%n", fin2.entry());
			System.out.printf("Parcela: %.2f%n", fin2.quota());
			System.out.printf("Renda mensal: %.2f%n", fin2.getIncome());
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage());
		}

		try {
			Financing fin3 = new Financing(8000.0, 450000.00, 90);
			System.out.println(fin3);
			System.out.println("Dados do financiamento:");
			System.out.println("Entrada: " + formatCoin(fin3.entry()));
			System.out.println("Parcela: " + formatCoin(fin3.quota()));
			System.out.println("Renda mensal: " + formatCoin(fin3.getIncome()));
		
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage());
		}

	}

}
