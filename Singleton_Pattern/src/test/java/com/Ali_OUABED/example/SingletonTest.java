package com.Ali_OUABED.example;

import junit.framework.Test;
import junit.framework.TestCase;

public class SingletonTest extends TestCase {
	 @Test
	    public void testSingleton() {
	        Singleton singleton1 = Singleton.getInstance();
	        Singleton singleton2 = Singleton.getInstance();

	        // Les deux instances doivent être les mêmes
	        assertEquals(singleton1, singleton2);

	        // Vérifie que la méthode getMessage renvoie la bonne valeur
	        assertEquals("Hello, Singleton!", singleton1.getMessage());
	    }
}
