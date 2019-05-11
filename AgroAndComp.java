package com.AgroAndComp;

import java.util.*;

public class AgroAndComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*********
		 * Agro *
		 *********/
		Agro2 mh = new Agro2("Mark Hamel");
		Agro2 bs = new Agro2("Barbra Streisand");

		List<Agro2> movieStars = new ArrayList<Agro2>();

		movieStars.add(mh);
		movieStars.add(bs);

		System.out.println("----");
		System.out.println("----");

		Agro mainAgro = new Agro(movieStars);

		mainAgro.sayNames();

		System.out.println("----");

		System.out.println("Setting mainAgro to null");

		mainAgro = null;

		System.out.println("Accessing mainAgro again...");

		try {
			mainAgro.sayNames();
		}

		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("----");

		System.out.println("Accessing independent Agro objects now");

		mh.Say();
		bs.Say();
		
		System.out.println("----");
		System.out.println("----");

		/*********
		 * Comp *
		 *********/
		Comp mainComp = new Comp();

		mainComp.sayNames();
		
		System.out.println("----");

		System.out.println("Setting mainComp to null");

		mainComp = null;

		System.out.println("Accessing mainComp again");
		
		try {
			mainComp.sayNames();
		}

		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("----");
		
		System.out.println("Accessing independent Comp objects now");
		System.out.println("Actually I can't. They don't exist anymore so I can't access them.");
		
		
	}

}
