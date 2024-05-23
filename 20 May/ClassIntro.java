package com.acc.lkm.JavaDay1;

public class ClassIntro {
	String brandName;
	String modelName;
	int price;
	int topSpeed;
	public void move(String model) {
		System.out.println(model+" is moving.");
	}
	public void park(String model) {
		System.out.println(model+" is parked.");
	}
	public void stop(String model) {
		System.out.println(model+" is stopped.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassIntro c1 = new ClassIntro();
		c1.brandName = "Tata";
		c1.modelName = "Harrier";
		c1.price = 2000000;
		c1.topSpeed = 180;
		c1.move(c1.modelName);
		c1.park(c1.modelName);
		c1.stop(c1.modelName);
	}

}
