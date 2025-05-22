package Lab2_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileCopier {

     public static void copy(String imageSource, String imageResult) {
        try (
            FileInputStream inputStream = new FileInputStream(imageSource);
            FileOutputStream outputStream = new FileOutputStream(imageResult)
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.println(i);
                outputStream.write(i);
            }
            if((i = inputStream.read()) == -1){
                System.out.println(i);
                System.out.println("Final");
            }
            System.out.println("Зображення скопійовано успішно!");
        } catch (IOException e) {
            System.out.println("Сталася помилка під час копіювання зображення: " + e.getMessage());
        }

}
}
