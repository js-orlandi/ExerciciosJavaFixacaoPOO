package application;

import java.util.Locale;
import java.util.Scanner;

import aluno.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno notas = new Aluno();

		notas.nome = sc.nextLine();
		notas.nota1 = sc.nextDouble();
		notas.nota2 = sc.nextDouble();
		notas.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", notas.somaNota());

		if (notas.somaNota() > 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + notas.finalGrade() + " POINTS");
			
		}
		sc.close();
	}

}
