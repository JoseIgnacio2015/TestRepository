package project.coche.test;

import project.coche.beans.*;

public class TestCoche {

	public static void main(String[] args){
		
		Coche c = new Coche();
		c.setName("For Focus");
		c.setModelo("Trend");
		c.setPuertas(5);
		
		System.out.println(c.toString());
	}
}
