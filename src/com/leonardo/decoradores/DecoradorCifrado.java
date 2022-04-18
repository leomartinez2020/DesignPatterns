package com.leonardo.decoradores;

import com.leonardo.cifrado.PlantillaCifrado;

public abstract class DecoradorCifrado extends PlantillaCifrado {
    // Protected variable
    protected PlantillaCifrado decoratedCipher;

    // Method 1
    // Abstract class method
    public DecoradorCifrado(PlantillaCifrado decoratedCipher) {
        // This keyword refers to current object itself
        this.decoratedCipher = decoratedCipher;
    }

    // Method 2
    // Outside abstract class
    public String encrypt(String message) {
        return decoratedCipher.encrypt(message);
    }
}
