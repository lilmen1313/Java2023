import java.sql.Time;

/**
 * Дано четное число N (>0) и символы c1 и c2.
 * 📌 Написать метод, который вернет строку длины N, которая
 * состоит из чередующихся символов c1 и c2, начиная с c1.
 */

public class Task1 {
    public static void main(String[] args) {
        long start = System. currentTimeMillis();
        System.out.println(getString(1000000, '+', '-'));
        long finish = System. currentTimeMillis();
        long delta = finish - start;
        System.out.println("Время выполнения: " + delta + ", мс");
    }

    static String getString(int n, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        if (n > 0 && n % 2 == 0){
            for (int i = 0; i < n / 2; i++) {
                sb.append(c1).append(c2);
            }
            return sb.toString();
        }
        else return "";
    }
}
