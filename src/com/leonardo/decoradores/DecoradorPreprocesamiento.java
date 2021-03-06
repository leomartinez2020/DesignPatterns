package com.leonardo.decoradores;

import com.leonardo.cifrado.PlantillaCifrado;

/**
 * Esta clase extiende el decorador para preprocesar cadenas de texto
 * Lo que hace es eliminar una parte del texto que no es mensaje
 */
public class DecoradorPreprocesamiento extends DecoradorCifrado {
    public DecoradorPreprocesamiento(PlantillaCifrado decoratedCipher) {
        super(decoratedCipher);
    }

    @Override
    public String encrypt(String message) {
        String processedMessage = preprocessMessage(message);
        return decoratedCipher.encrypt(processedMessage);
    }

    private String preprocessMessage(String message) {
        // Solo deja el texto después del guión
        int corte = message.indexOf('-');
        message = message.substring(corte + 1);
        return message;
    }
}
