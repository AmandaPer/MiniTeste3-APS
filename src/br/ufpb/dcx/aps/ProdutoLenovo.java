package br.ufpb.dcx.aps;

public class ProdutoLenovo extends ProdutoComputador {
	
	private String tipoSistema;
	
	public ProdutoLenovo(int numeroDeSerie, String cor,String tipoSistema) {
		super(numeroDeSerie, cor);
		this.tipoSistema = tipoSistema;
	}

	public String getTipoSistema() {
		return tipoSistema;
	}

	public void setTipoSistema(String tipoSistema) {
		this.tipoSistema = tipoSistema;
	}
	
}
