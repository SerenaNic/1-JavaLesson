package it.unirc.ing.alg_struttdati.esempio.util;

public class GenericTest {

	// metodo generico                       
	public static < E > void printArray( E[] inputArray )
	{
		// Stampa elementi dell'array               
		for ( E element : inputArray ){        
			System.out.printf( "%s ", element );
		}
		System.out.println();
		
	}
}
