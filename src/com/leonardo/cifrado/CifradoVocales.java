package com.leonardo.cifrado;

import java.util.HashMap;
import java.util.Map;

public class CifradoVocales extends PlantillaCifrado {
    @Override
    public String encrypt(String message) {
        Map<Character, Character> mapa = obtenerMapaVocales();
        StringBuilder cipherText = new StringBuilder();
        for (int ii = 0; ii < message.length(); ii++) {
            Character newVal = message.charAt(ii);
            cipherText.append(mapa.getOrDefault(newVal, newVal));
        }
        return cipherText.toString();
    }

    private Map<Character, Character> obtenerMapaVocales() {
        Map<Character, Character> map = new HashMap<>();
        map.put('a', '1');
        map.put('e', '2');
        map.put('i', '3');
        map.put('o', '4');
        map.put('u', '5');
        return map;
    }
}
