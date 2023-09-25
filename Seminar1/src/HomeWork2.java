public class HomeWork2 {
    public static void main(String[] args) {
        printPrimeNums();
    }

    static void printPrimeNums(){
        for (int i = 1; i < 1001; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
        }
    }
}
