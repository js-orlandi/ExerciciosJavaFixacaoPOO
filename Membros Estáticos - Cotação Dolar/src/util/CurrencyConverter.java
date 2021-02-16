package util;

import java.io.PrintStream;

public class CurrencyConverter {

	public static double dolar;
	public static double valorDolar;

	public static double valorDolarReais() {
		return valorDolar * dolar;
	}

	public static double valorComIOF() {
		return (valorDolarReais() / 100.00) * 6.0 + valorDolarReais();

	}
	
	
}
