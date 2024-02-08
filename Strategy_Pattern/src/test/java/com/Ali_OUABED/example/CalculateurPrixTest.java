package com.Ali_OUABED.example;

//CalculateurPrixTest
import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class CalculateurPrixTest extends TestCase {
 @Test
 public void testCalculPrixAchatNormal() {
     CalculateurPrix calculateur = new CalculateurPrix(new StrategyAchatNormal());
     double prixCalculé = calculateur.calculer(100);
     assertEquals(100, prixCalculé, 0.001); // Le prix ne change pas
 }

 @Test
 public void testCalculPrixAchatDiscount() {
     CalculateurPrix calculateur = new CalculateurPrix(new StrategyAchatDiscount());
     double prixCalculé = calculateur.calculer(100);
     assertEquals(90, prixCalculé, 0.001); // Réduction de 10%
 }
}

