package fr.dta.tp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUnitaure {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {	
			System.out.println(estDivisiblePar3par5OuLesDeux(i));
		}
	}

	public static List<Integer> estDivisiblePar3par5OuLesDeux(int candidat) {
		
		if(candidat==0)
			return Collections.emptyList();
		
		List<Integer> resultat=new ArrayList<>();
		
		double x= candidat;
		double y= x/(double)3;
		double z= x/(double)5;
		
		if(y==(int)y)
			resultat.add(3);
		if(z==(int)z)
			resultat.add(5);
		
		if(resultat.isEmpty())
			return Collections.emptyList();
		
		return resultat;
	} 
}
