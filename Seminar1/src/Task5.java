import java.util.Arrays;

/**
 *Дан массив nums = [3,2,2,3] и число val = 3.
 * 📌 Если в массиве есть числа, равные заданному, нужно перенести
 * эти элементы в конец массива.
 * 📌 Таким образом, первые несколько (или все) элементов массива
 * должны быть отличны от заданного, а остальные - равны ему.
 */
public class Task5 {
    public static void main(String[] args){
        int[] arr = new int[] {3,2,2,3,3,2,1,2,2,1};
        swapNum(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void swapNum(int[] arr) {
        int val = 1;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == val){
                arr[i] = arr[j];
                arr[j] = val;
                j--;
            }
            else {
                i++;
            }
        }
    }
    private static void printArr(int[] arr) {
        for (int item: arr) {
            System.out.print(item );
        }
    }
}
