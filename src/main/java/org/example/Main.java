package org.example;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("Camisa", 50));
        carrinho.adicionaItem(new Item("Calça", 100));

        PagamentoStrategy pagamentoStrategy = new PixPagamento();
        carrinho.realizaPagamento(pagamentoStrategy);

        FreteStrategy freteStrategy = new SedexFrete();
        System.out.println("Valor do frete: R$ " + String.format("%.2f", carrinho.calculaFrete(freteStrategy)));
    }
}