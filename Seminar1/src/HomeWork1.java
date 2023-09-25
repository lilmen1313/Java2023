public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println(countNTriangle(6));
    }

    static int countNTriangle(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
