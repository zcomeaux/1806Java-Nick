package com.revature;

import com.revature.flow.FlowControl;

public class Driver {
	
	static public void main(String pirateSounds[]){
		
		System.out.println(pirateSounds[0]);
		System.out.println(pirateSounds[1]);
		System.out.print("Hello World!");
		
		FlowControl fc = new FlowControl(5);
		fc.ifMethod(true, 3);
		System.out.println("------------");
		fc.ifMethod(false, 8);
		System.out.println("------------");
		fc.switchMethod("fallthrough");
		System.out.println("------------");
		fc.loopMethod(12, "hi");
		System.out.println("------------");
		fc.whileMethod("hi");
		
	}

}