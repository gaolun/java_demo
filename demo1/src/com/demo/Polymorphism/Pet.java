package com.demo.Polymorphism;
/**
 * 
 * @author GaoLun
 * @Desc pet:宠物类--->狗狗和企额的父类
 */
public abstract class Pet {
	protected String name="无名式";
	protected int health=100;
	protected int love=0;
	
	public Pet(String name){
		this.name=name;
	}
	public void print(){
		System.out.println("宠物的名字:"+name+ "宠物的健康值:"+health+ ":和主人的亲密度"+love);
	}
	public abstract void eat();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	
}
