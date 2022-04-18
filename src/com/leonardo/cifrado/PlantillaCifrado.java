package com.leonardo.cifrado;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class PlantillaCifrado {
    public abstract String encrypt(String message);

    // Method used by all instances
    public final void writeEncryptedMessageToFile(String encryptedMessage, String encryptionType) {
        Date date = new Date();
        // El nombre del archivo se compone del tipo de encripción y la fecha y hora
        // El archivo es de tipo: cesar-2022-04-18-06-22-23.txt
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String newFile = encryptionType + "-" + dateFormat.format(date) + ".txt";
        String folder = System.getProperty("user.dir");
        Path filePath = Paths.get(folder, "data", newFile);
        //System.out.println(filePath);
        try {
            FileWriter obj = new FileWriter(filePath.toString());
            obj.write(encryptedMessage);
            obj.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
