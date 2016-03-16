import java.util.Arrays;

/**
 * Created by dcatalans on 16/03/16.
 */

public class Ordena {
    public static void main(String[] args) {
        int[] ar = { -2147483648,0,2147483647};
        com.esliceu.sort.Sort s = new com.esliceu.sort.Sort();
        System.out.print(Arrays.toString(s.BubbleSort(ar)));
    }
}
