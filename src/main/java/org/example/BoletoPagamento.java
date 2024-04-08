package org.example;

class BoletoPagamento implements PagamentoStrategy {
    public void realizaPagamento(double valor) {
        System.out.println("Pagamento via Boleto Bancário no valor de R$ " + String.format("%.2f", valor));
    }
}