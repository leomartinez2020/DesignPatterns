package com.leonardo.cifrado;

public class CifradoInvertido extends PlantillaCifrado {
    @Override
    public String encrypt(String message) {
        StringBuilder newText = new StringBuilder(message);
        return newText.reverse().toString();
    }
}
