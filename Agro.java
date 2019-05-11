package com.AgroAndComp;

import java.util.List;

public class Agro {
	
	List<Agro2> agroList;
	
	public Agro(List<Agro2> newAgro){
		this.agroList = newAgro;
	}
	
	public void sayNames() {
		for(Agro2 x: agroList) {
			x.Say();
		}
	}

}
