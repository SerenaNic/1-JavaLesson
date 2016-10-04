package it.unirc.ing.alg_struttdati.esempio.util;

public abstract class StudenteAstratto {

	int[] voti={19,22,23};
	
	public double media(int e)
	{
		voti[4]=3;
		
		double sum=0.0;
		for(int i=0;i<e;i++)
		{
			sum+=voti[i];
		}
		return sum/e;
	}
}
