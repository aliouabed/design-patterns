package com.Ali_OUABED.example;

public class StrategyAchatDiscount implements Strategy {
    @Override
    public double calculerPrix(double prix) {
        return prix * 0.9; // Réduction de 10%
    }
}