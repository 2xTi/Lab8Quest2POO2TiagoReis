package org.example;

import java.util.List;

class NormalFrete implements FreteStrategy {
    public double calculaFrete(List<Item> items) {
        return items.size() * 5; // Valor fixo de R$ 5 por item
    }
}