package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		CurrencyConverter.dolar = sc.nextDouble();
		System.out.println("how many dollars will be bought ");
		CurrencyConverter.valorDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.valorComIOF());
	}

}
