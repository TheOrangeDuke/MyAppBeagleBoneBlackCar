package com.myselia.myapp.beagleboneblackcar;

import com.myselia.myapp.beagleboneblackcar.ui.CarController;
import com.myselia.sandbox.runtime.templates.MyseliaMasterModule;

public class Master extends MyseliaMasterModule{
	
	CarController troll = new CarController();
	
	public Master(){
		System.out.println("Master Module Instantiated");
	}

	@Override
	public void setup() {
		System.out.println("MASTERLOL");
		troll.setFrame();
	}

	@Override
	protected void tick() {
		
	}

}
