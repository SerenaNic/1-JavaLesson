package it.unirc.ing.alg_struttdati.esempio;

import java.util.LinkedList;

import it.unirc.ing.alg_struttdati.esempio.util.GenericTest;
import it.unirc.ing.alg_struttdati.esempio.util.StudenteRappresentante;
import it.unirc.ing.alg_struttdati.esempio.util.Studente;
import it.unirc.ing.alg_struttdati.esempio.util.StudenteLavoratore;

public class Esecuzione {

	public static void main (String[] args)
	{
		//uso del costruttore parametrizzato
		System.out.println("-Costruttore parametrizzato-");
		Studente s = new Studente(1000678, "Neri", "Francesca");
		System.out.println(s.toString()+"\n");

		//uso dei metodi set e get
		System.out.println("-Metodi set e get-");
		s.setCognome("Bianchi");
		System.out.println(s.toString());
		System.out.println("matricola= "+s.getMatricola()+"\n");


		//uso dell'ereditarietà e del polimorfismo
		System.out.println("-Ereditarietà e Polimorfismo-");
		Studente lav = new StudenteLavoratore(1000679, "Bianchi", "Paolo",1200);
		System.out.println(lav.toString());

		Studente rap = new StudenteRappresentante(1000373, "Rossi", "Maria",452);
		System.out.println(rap.toString()+"\n");


		//test sui Java Generics
		System.out.println("-Java Generics-");
		Integer[] intArray = { 21, 22, 30, 24 };
		Double[] doubleArray = { 21.0, 22.0, 30.0, 24.0 };
		String[] charArray = { "Ventuno", "Ventidue", "Trenta", "Ventiquattro" };

		System.out.println( "Array integerArray contiene:" );
		GenericTest.printArray( intArray  ); // passaggio di un array di Integer

		System.out.println( "Array doubleArray contiene:" );
		GenericTest.printArray( doubleArray ); // passaggio di un array di Double

		System.out.println( "Array characterArray contiene:" );
		GenericTest.printArray( charArray ); //  passaggio di un array di String

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Integer i: list)
		
				list.remove(i);
		System.out.println(list);

	}
}
