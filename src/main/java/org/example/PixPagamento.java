package org.example;

class PixPagamento implements PagamentoStrategy {
    public void realizaPagamento(double valor) {
        System.out.println("Pagamento via Pix no valor de R$ " + String.format("%.2f", valor));
    }
}