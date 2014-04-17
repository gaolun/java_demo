package com.demo.Polymorphism;

public class Dog extends Pet {

	private String strain;
	
	public Dog(String name,String strain) {
		super(name);
		this.strain=strain;
	}
	public void print(){
		super.print();
		System.out.println(" 我是一只:"+strain +".");
	}
	@Override
	public void eat() {
		super.health+=3;
		System.out.println("狗狗"+super.name+ "吃饱了，健康值家3");
	}
	public void catchingFly(){
		System.out.println("狗狗"+super.name+ "正在接飞碟");
		super.health-=2;
		super.love+=3;
	}
	
	
	
	
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	

}
