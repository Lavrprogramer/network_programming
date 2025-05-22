package Lab2_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopier {

    public static void copy(String sourcePath, String resultPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(resultPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл скопійовано успішно.");
        } catch (IOException e) {
            System.err.println("Помилка при копіюванні файлу: " + e.getMessage());
        }
    }
}
