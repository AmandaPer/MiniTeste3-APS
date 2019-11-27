package br.ufpb.dcx.aps;

import java.util.ArrayList;
import java.util.List;

public class Computador {

	protected List<ProdutoComputador> cadastro = new ArrayList<ProdutoComputador>();
	
	protected ProdutoComputador criarProdutoComputador(int numeroDeSerie, String cor) {
		return new ProdutoComputador(numeroDeSerie, cor);
	}
	
	public void cadastrarProduto(ProdutoComputador computador) {
		ProdutoComputador produtoComputador = criarProdutoComputador(0, null);
		cadastro.add(produtoComputador);
	}

	
}
