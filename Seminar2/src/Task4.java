import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 📌 Напишите метод, который составит строку, состоящую из 100
 * повторений слова TEST и метод, который запишет эту строку в
 * простой текстовый файл, обработайте исключения.
 */

public class Task4 {
    public static void main(String[] args) {
        String text = repeatWord("Test", 100);
        writeToFile(text, "Test.txt");
    }

    static String repeatWord(String str, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    static void writeToFile(String str, String path){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(str);
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
}
