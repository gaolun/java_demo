package com.demo.exception;

@SuppressWarnings("serial")
public class MyException extends Exception{
	public MyException(){
		super();
	}
	public MyException(String message){
		super(message);
	}
	public MyException(String message,Throwable cacse){
		super(message,cacse);
	}
	
}
