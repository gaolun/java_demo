package com.demo.innerclass;

import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
			//member inner class 
			Animal.Inner inner=new Animal().new Inner();
			inner.show();
			inner.showTime(new Date());
			
			//Anonymous inner class
			Animal animal=new Animal();
			@SuppressWarnings("serial")
			String stringDate=animal.getDateString(new Date(){});
			System.out.println(stringDate);
	}
}
