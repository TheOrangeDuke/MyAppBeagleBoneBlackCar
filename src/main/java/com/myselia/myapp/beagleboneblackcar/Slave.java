package com.myselia.myapp.beagleboneblackcar;

import com.myselia.sandbox.runtime.templates.MyseliaSlaveModule;

public class Slave extends MyseliaSlaveModule {
	
	public Slave(){
		System.out.println("Slave Module Instantiated");
	}

	@Override
	public void setup() {
		System.out.println("SLAVELOL");
	}

	@Override
	protected void tick() {
		
	}

}
