package org.example;

import java.util.ArrayList;
import java.util.List;

class CarrinhoCompras {
    private List<Item> items;

    public CarrinhoCompras() {
        this.items = new ArrayList<>();
    }

    public void adicionaItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPreco();
        }
        return total;
    }

    public void realizaPagamento(PagamentoStrategy pagamentoStrategy) {
        pagamentoStrategy.realizaPagamento(calculaTotal());
    }

    public double calculaFrete(FreteStrategy freteStrategy) {
        return freteStrategy.calculaFrete(items);
    }
}
