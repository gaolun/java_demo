package com.demo.Polymorphism.homework;

public abstract class Car {
	protected String brand;
	protected String carNum;
	protected String name;
	protected double dayRent;
	public Car(String brand, String carNum, String name, double dayRent) {
		super();
		this.brand = brand;
		this.carNum = carNum;
		this.name = name;
		this.dayRent = dayRent;
	}
	public Car() {
	}
	
	public abstract double callRent(int days,double dayRent);
}
