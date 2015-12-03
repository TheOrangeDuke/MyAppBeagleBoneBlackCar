package com.myselia.myapp.beagleboneblackcar;

import com.myselia.myapp.beagleboneblackcar.ui.CarController;
import com.myselia.sandbox.templates.MyseliaMasterModule;

public class Master extends MyseliaMasterModule{
	
	CarController troll = new CarController();
	
	public Master(){
		System.out.println("Master Module Instantiated");
	}


}
