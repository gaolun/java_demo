package com.demo.Polymorphism;

public class Master {
	private String name="";
	private int moeny=0;
	
	public Master(String name, int moeny) {
		this.name = name;
		this.moeny = moeny;
	}
	public void feed(Pet pet){
		pet.eat();
	}
	public void play(Pet pet){
		if(pet instanceof Dog){
			Dog dog=(Dog) pet;
			dog.catchingFly();
		}else if(pet instanceof Penguin){
			Penguin penguin=(Penguin) pet;
			penguin.swing();
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoeny() {
		return moeny;
	}
	public void setMoeny(int moeny) {
		this.moeny = moeny;
	}
	
}
