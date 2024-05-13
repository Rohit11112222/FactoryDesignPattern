package com.jwt;

public class FactorPatternMainMethod {
	public static void main(String[] args) {
		ProfessionFactorPattern professionFactorPattern=new ProfessionFactorPattern();
		Profession tre = professionFactorPattern.getProfession("Doctor");
		tre.print();
		
	}

}
