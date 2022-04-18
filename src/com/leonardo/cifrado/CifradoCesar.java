package com.leonardo.cifrado;

public class CifradoCesar extends PlantillaCifrado {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public String encrypt(String message) {
        int shiftKey = 13;
        int corte = message.indexOf('-');
        message = message.substring(corte + 1);
        message = message.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int ii = 0; ii < message.length(); ii++) {
            if (message.charAt(ii) == ' ') {
                cipherText.append(' ');
                continue;
            }
            int charPosition = alpha.indexOf(message.charAt(ii));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText.append(replaceVal);
        }
        return cipherText.toString();
    }
}
