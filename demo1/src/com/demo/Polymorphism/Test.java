package com.demo.Polymorphism;

public class Test {
	public static void main(String[] args) {
		Pet pet=new Dog("小白", "学那瑞");
		Master master=new Master("高论", 100);
		master.play(pet);
		master.feed(pet);
		
	}
}	
