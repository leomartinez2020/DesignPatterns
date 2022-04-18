package com.leonardo.fabrica;

import com.leonardo.cifrado.CifradoCesar;
import com.leonardo.cifrado.CifradoInvertido;
import com.leonardo.cifrado.CifradoVocales;
import com.leonardo.cifrado.PlantillaCifrado;
import com.leonardo.decoradores.DecoradorPreprocesamiento;

public class FabricaCifrado {
    //Comment
    public PlantillaCifrado getCipher(String cipherType) {
        if (cipherType == null) {
            return null;
        }
        if (cipherType.equalsIgnoreCase("CESAR")) {
            PlantillaCifrado cesar = new CifradoCesar();
            return new DecoradorPreprocesamiento(cesar);

        } else if (cipherType.equalsIgnoreCase("INVERTIDO")) {
            PlantillaCifrado invertido = new CifradoInvertido();
            return new DecoradorPreprocesamiento(invertido);

        } else if (cipherType.equalsIgnoreCase("VOCALES")) {
            PlantillaCifrado vocales = new CifradoVocales();
            return new DecoradorPreprocesamiento(vocales);
        }

        return null;
    }
}
