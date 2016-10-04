package it.unirc.ing.alg_struttdati.esempio.util;

public class Studente implements StudenteInterfaccia{

	private int matricola;
	private String cognome;
	private String nome;
	
	public Studente(int matricola, String cognome, String nome) {
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "matricola=" + matricola + "- cognome=" + cognome
				+ "- nome=" + nome + "-";
	}
}
