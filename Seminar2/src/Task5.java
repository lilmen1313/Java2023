import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 📌 Напишите метод, который вернет содержимое текущей папки в виде
 * массива строк.
 * 📌 Напишите метод, который запишет массив, возвращенный предыдущим
 * методом в файл.
 * 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
 * возникновения исключения, оно должно записаться в лог-файл.
 */

public class Task5 {
    static Logger logger = Logger.getLogger(Task5.class.getName()); // статический, поэтому без new

    public static void main(String[] args) {
        String[] arrDir = getArrStrDir();
        loggerInit();
        writeToFile(arrDir, "NameFileAndFolder.txt");
    }

    static String[] getArrStrDir(){ //получение массива имен файлов и папок в каталоге
        File file = new File(".");
        return file.list();
    }

    static public void writeToFile(String[] str, String path){  //запись массива в файл
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { //ресурсный try - catch
            for (String el:
                 str) {
                bw.write(el + System.lineSeparator());
            }
        }
        catch (IOException e){
            logger.info(e.getMessage());
        }
    }

    static public void loggerInit(){ //инициализация логгера
        try {
            FileHandler fh = new FileHandler("log.txt"); //Handler - это обработчик
            logger.addHandler(fh); // в логгер добавляем обработчик
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter); // в обработчик добавляем форматер
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
