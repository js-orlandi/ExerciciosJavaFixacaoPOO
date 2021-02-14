package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);

		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rect.Width = sc.nextDouble();
		rect.Height = sc.nextDouble();
		
		System.out.println("AREA = " + rect.area());
		System.out.printf("PERIMETER =  %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		
		sc.close();
	}

}
