package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutoMap;

	public EstoqueProdutos() {
		this.estoqueProdutoMap = new HashMap<>();
	}
	
	 public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		    estoqueProdutoMap.put(cod, new Produto(cod, nome, preco, quantidade));
		  }
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.exibirProdutos();
		estoque.adicionarProduto(55, "CD", 5, 25);
		estoque.adicionarProduto(20, "PenDrive", 25, 40);
		estoque.adicionarProduto(11, "Cabo USB", 10, 30);
		estoque.adicionarProduto(05, "Fone", 2, 100);
		
		estoque.exibirProdutos();
		System.out.println("Valor total dos produtos do estoque é: " + estoque.calcularValorTotalEstoque());
		System.out.println("O produto mais caro dos estoque é: " + estoque.obterProdutoMaisCaro());
	}
}