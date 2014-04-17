package com.demo.Polymorphism;
/**
 * @author root
 */
public class Penguin extends Pet {
	private String sex;
	public Penguin(String name,String sex) {
		super(name);
		this.sex=sex;
	}
	@Override
	public void eat() {
		super.health=super.health+5;
		System.out.println("企额"+super.name+"吃饱了，健康值家5");
	}
	public void print(){
		super.print();
		System.out.println("性别是:"+ this.sex+".");
	}
	public void swing(){
		System.out.println("企额"+super.name+"在游泳");
		super.health+=10;
		super.love+=3;
	}
	
	
	
	

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
