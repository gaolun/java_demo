package com.demo.innerclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	private String name="gaol";
	private int age=12;
	private static final String FORMAT="yyyy-MM-dd HH:mm:ss E";
	private static final SimpleDateFormat simpleDateFormat=new SimpleDateFormat(FORMAT);
	
	
	public static String getDateString(Date date){
		return simpleDateFormat.format(date);
	}
	public static Date getDateDate(String str) throws Exception{
		Date date=null;
		try {
			date=simpleDateFormat.parse(str);
		} catch (ParseException e) {
			throw new Exception(e);
		}
		return date;
	}
	
	//member inner class
	public class Inner{
		int i=0;
		public void show(){
			System.out.println(name+Animal.this.age);
		}
		@SuppressWarnings("static-access")
		public void showTime(Date date){
			System.out.println(Animal.this.getDateString(date));
		}
	}
	
}
