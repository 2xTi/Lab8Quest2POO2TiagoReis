package org.example;

import java.util.List;

class SedexFrete implements FreteStrategy {
    public double calculaFrete(List<Item> items) {
        return items.size() * 10; // Valor fixo de R$ 10 por item
    }
}