package com.mohit;

public class PhoneFactory {
	
	public static Parent getPhone(String name){
		if(name.equals("Android"))
			return new Android();
		else
			return new Iphone();
	}

}
