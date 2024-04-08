package org.example;

class CartaoPagamento implements PagamentoStrategy {
    public void realizaPagamento(double valor) {
        System.out.println("Pagamento via Cartão de Crédito no valor de R$ " + String.format("%.2f", valor));
    }
}