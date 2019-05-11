package com.AgroAndComp;

import java.util.*;

public class Comp {

	private final List<Comp2> compList;
	

	
	public Comp(){
		
		Comp2 jn = new Comp2("John Newman");
		Comp2 rf = new Comp2("Rick Flare");
		List<Comp2> newComp = new ArrayList<Comp2>(); 
		newComp.add(jn);
		newComp.add(rf);
		this.compList = newComp;
	}
	
	public void sayNames() {
		for(Comp2 x: compList) {
			x.Say();
		}
	}
}
