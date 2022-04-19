package com.leonardo.cifrado;

/**
 * Esta clase implementa el cifrado simple que consiste
 * en devolver la cadena de texto con letras invertidas
 */
public class CifradoInvertido extends PlantillaCifrado {
    @Override
    public String encrypt(String message) {
        StringBuilder newText = new StringBuilder(message);
        return newText.reverse().toString();
    }
}
