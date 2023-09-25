/**
 * 📌 Напишите метод, который сжимает строку.
 * 📌 Пример.
 * вход: aaaabbbcdd
 * результат: a4b3c1d2
 */

public class Task2 {
    public static void main(String[] args) {
        String string = "aaabbbbccddd";
        System.out.println(compressastring(string));
    }

    static String compressastring(String str){

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char ch = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }
            else {
                sb.append(ch).append(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        sb.append(ch).append(count);
        return sb.toString();
    }
}
