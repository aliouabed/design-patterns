package com.Ali_OUABED.example;

public class CalculateurPrix {
    private Strategy strategy;

    public CalculateurPrix(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculer(double prixProduit) {
        return strategy.calculerPrix(prixProduit);
    }
}