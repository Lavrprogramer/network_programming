package Lab2_8;

/* Завдання №2. Копіювання файлу до іншого файлу
• Написати клас, який копіює вміст текстового файлу та картинки з 
одного файлу до іншого. 
• Використовуємо класи BufferedReader, FileReader, BufferedWriter, 
FileWriter, FileInputStream, FileOutputStream. 
• Використати try-with-resources. */



public class Lab2_8 {
public static void main(String[] args) {
        // txt
        String textSource = "D:\\University\\2_курс\\2\\Мережеве_програмування\\labs\\Lab2_8\\test.txt";  // або просто "source.txt"
        String textResult = "D:\\\\University\\\\2_курс\\\\2\\\\Мережеве_програмування\\\\labs\\\\Lab2_8\\copy.txt";

        //  img
        String imageSource = "D:\\\\University\\\\2_курс\\\\2\\\\Мережеве_програмування\\\\labs\\\\Lab2_8\\testImage.jpg";   // або просто "image.jpg"
        String imageResult = "D:\\\\University\\\\2_курс\\\\2\\\\Мережеве_програмування\\\\labs\\\\Lab2_8\\copyImage.jpg";

        TextFileCopier.copy(textSource, textResult);
        ImageFileCopier.copy(imageSource, imageResult);
    }
    
}
