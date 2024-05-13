package com.jwt;

public class ProfessionFactorPattern {
	
	public Profession getProfession(String checkProfession)
	{
		if(checkProfession==null)
		{
			return null;
		}
		if(checkProfession.equalsIgnoreCase("Doctor"))
		{
			return new Docter();
		}
		else if (checkProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}
		return null;
		
	}


}
