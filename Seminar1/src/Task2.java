import java.util.Scanner;

/**
 Написать программу, которая запросит пользователя ввести
 <Имя> в консоли.
 Получит введенную строку и выведет в консоль сообщение
 “Привет, <Имя>!”
 */

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Привет " + name + "!");
    }
}
