package com.myselia.myapp.beagleboneblackcar;

import com.myselia.sandbox.runtime.templates.MyseliaApplication;

public class Application {
	
	static MyseliaApplication<Master, Slave> app;
	
	public static void main(String[] args){

		app = new MyseliaApplication<Master, Slave>(Master.class, Slave.class, args);	
		app.applicationName("myapp002");
		app.start();
		
		System.out.println("Myselia Application : Beagle Bone Black Car");
		
	}

}
