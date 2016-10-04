package it.unirc.ing.alg_struttdati.esempio.util;

public class StudenteLavoratore extends Studente {

	private double stipendio;

	public StudenteLavoratore(int matricola, String cognome, String nome, double stipendio) {
		super(matricola, cognome, nome);
		this.stipendio=stipendio;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return super.toString()+ " stipendio=" + stipendio + "- LAVORATORE";
	}

}
