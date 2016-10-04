package it.unirc.ing.alg_struttdati.esempio.util;

public class StudenteRappresentante extends Studente {

	private int numVoti;

	public StudenteRappresentante(int matricola, String cognome, String nome, int numVoti) {
		super(matricola, cognome, nome);
		this.numVoti= numVoti;
	}

	public int getNumVoti() {
		return numVoti;
	}

	public void setNumVoti(int numVoti) {
		this.numVoti = numVoti;
	}

	@Override
	public String toString() {
		return super.toString()+ " numVoti=" + numVoti + "- RAPPRESENTANTE";
	}

	
}
