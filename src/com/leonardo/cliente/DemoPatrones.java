package com.leonardo.cliente;

import com.leonardo.cifrado.PlantillaCifrado;
import com.leonardo.fabrica.FabricaCifrado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que ejecuta el código e interactúa con el usuario
 */
public class DemoPatrones {
    public static String getMessageFromFile(String filePath) throws FileNotFoundException {
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj, "windows-1252");
            String data = myReader.nextLine();
            System.out.println(data);
            myReader.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, "windows-1252");
        String filePath;
        //int key = 0;
        System.out.println("Ingrese la ruta del archivo de texto para encriptar:");
        filePath = sc.nextLine();
        System.out.println("Archivo a leer: " + filePath);
        String texto = getMessageFromFile(filePath);
        int corte = texto.indexOf('-');
        String tipoCodificacion = texto.substring(0, corte);
        String message = texto.substring(corte + 1);

        FabricaCifrado cipherFactory = new FabricaCifrado();
        String msg;
        switch (tipoCodificacion) {
            case "cesar":
                PlantillaCifrado cesar = cipherFactory.getCipher("CESAR");
                msg = cesar.encrypt(message);
                System.out.println(msg);
                cesar.writeEncryptedMessageToFile(msg, "cesar");
                break;
            case "invertido":
                PlantillaCifrado invertido = cipherFactory.getCipher("INVERTIDO");
                msg = invertido.encrypt(message);
                System.out.println(msg);
                invertido.writeEncryptedMessageToFile(msg, "invertido");
                break;
            case "vocales":
                PlantillaCifrado vocales = cipherFactory.getCipher("VOCALES");
                msg = vocales.encrypt(message);
                System.out.println(msg);
                vocales.writeEncryptedMessageToFile(msg, "vocales");
                break;
            default:
                // code block
        }
    }
}
