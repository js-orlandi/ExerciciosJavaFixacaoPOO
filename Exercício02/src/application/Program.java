package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.Tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + emp.toString());
		System.out.print("Wich percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.printf("Updated data " + emp.toString());
		
		

	}

}
