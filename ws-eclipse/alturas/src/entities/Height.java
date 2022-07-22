package entities;

public class Height {
	private String name;
	private double height;
	private int age;
	
	public Height() {
	}
	
	public Height(String name, double height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double heightAverage(int size, double[] height) {
		double sum = 0;
		for(int i = 0; i< size; i++) {
			sum += height[i];
		}
		return sum/size;
	}
	//public double percentage() {}


	
}
