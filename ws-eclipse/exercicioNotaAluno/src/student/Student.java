package student;

public class Student {
	public String name;
	public double[] grade = new double[3];
	
	public double finalGrade(double [] grade) {
		double summation = 0;
		for(int i = 0; i < this.grade.length; i++) {
			grade[i] = this.grade[i];
			summation += grade[i];
		}
		return summation;
	}
	
	public double missingPoints() {
		return (60 - finalGrade(this.grade));
	}
	
	public boolean isApproved() {
		if(finalGrade(this.grade) < 60.0) {
			System.out.println("FAILED!");
			System.out.println("Missing points: " + missingPoints());
			return false;
		}
		else
			System.out.println("PASSED!");
		return true;
	}
	
}
