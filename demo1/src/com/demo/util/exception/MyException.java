package com.demo.util.exception;

@SuppressWarnings("serial")
public final class MyException extends Exception{
	public MyException(){
		super();
	}
	public MyException(String message){
		super(message);
	}
	public MyException(String mesString,Throwable cache){
		super(mesString, cache);
	}
}
