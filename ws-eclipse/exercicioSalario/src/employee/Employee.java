package employee;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}

	public double increaseSalary(double percentage) {
		double netSalary = netSalary(); 
		return netSalary += grossSalary * percentage/100;
	}
}
