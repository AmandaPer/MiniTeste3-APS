package br.ufpb.dcx.aps;

public class Lenovo extends Computador {

	private String tipoSistema;
	
	public Lenovo(String tipoSistema) {
		this.tipoSistema = tipoSistema;
	}
	
	protected ProdutoComputador criarProdutoComputador(int numeroDeSerie, String cor) {
		return new ProdutoLenovo(numeroDeSerie, cor, tipoSistema);
	}
}
