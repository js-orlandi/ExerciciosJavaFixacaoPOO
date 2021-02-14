package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double Tax;
	
	public double netSalary() {
		return grossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.00;
	}
   public String toString() {
	   return name + ", $ " + String.format("%.2f", netSalary());
   }
}
