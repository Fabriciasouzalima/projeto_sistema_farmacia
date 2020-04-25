package br.com.farmacia.domain;

public class Produtos {
	
	private long codigo;
	private String descricao;
	private long quantidade;
	private double preco;
	private Fornecedores fabricante; 
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Fornecedores getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fornecedores fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
