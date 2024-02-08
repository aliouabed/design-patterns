package com.Ali_OUABED.example;

public class StrategyAchatNormal implements Strategy {
    @Override
    public double calculerPrix(double prix) {
        return prix;
    }
}
