/**
        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        максимальное количество подряд идущих 1.
*/

public class Task4 {
    public static void main(String[] args){
        int[] arr = new int[] {1,1,1,1,1,0,0,1,1,1, 1};
        System.out.println(extracted(arr));
    }

    private static int extracted(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
            }
            else {
                maxCount = count > maxCount ? count: maxCount;
                count = 0;
            }
        }
        return maxCount = count > maxCount ? count : maxCount;
    }
}
