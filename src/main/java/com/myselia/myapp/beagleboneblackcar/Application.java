package com.myselia.myapp.beagleboneblackcar;

import com.myselia.sandbox.runtime.settings.MyseliaApplicationSettings;
import com.myselia.sandbox.templates.MyseliaApplication;

public class Application {
	
	static MyseliaApplication<Master, Slave> app;
	
	public static void main(String[] args){

		app = new MyseliaApplication<Master, Slave>(Master.class, Slave.class, new MyseliaApplicationSettings(args));	
		app.start();
		
		System.out.println("Myselia Application : Beagle Bone Black Car");
		
	}

}
