package com.demo.array;

import com.demo.exception.MyException;

public class Demo1 {
	public void show1(int i)throws MyException{
		
		int [] ds=new int[]{2,3,4,5,6};
		int [] arra ={1,2,3,4,5};
		int arra_i=0;
		try {
			arra_i=arra[i];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new MyException("shuzuyuejie", e);
		}finally{
			System.out.println(arra_i+"  super.name: "+arra.getClass().getName());
		}
	}
	public void show2(int i) throws MyException{
		int [][] array={{1,2,3,4,5}};
		int array_i=0;
		try {
			array_i=array[0][i];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new MyException("shuzuyuejie", e);
		}finally{
			System.out.println(array_i+"  super.name: "+array.getClass().getName());
		}
		
	}
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		try {
			demo1.show1(1);
			demo1.show2(1);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
