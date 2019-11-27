package br.ufpb.dcx.aps;

public class ProdutoComputador {
	
	private int numeroDeSerie;
	private String cor;
	
	public ProdutoComputador(int numeroDeSerie, String cor) {
		this.numeroDeSerie = numeroDeSerie;
		this.cor = cor;
	}
	
	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
