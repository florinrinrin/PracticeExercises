import java.util.ArrayList;
import java.util.Arrays;

public class ReturnSumOfPositiveFromArray {
   public static void main(String[] args) {
        int[] arrayOfInt = {1, -2, 3, 4, 5};
        int[] arrayOfInt1 = {-1, -2, 3, -4, 5};
        int[] arrayOfInt2 = {1, -2, 3, -4, -5};
        int[] arrayOfInt3 = {-1, -2, -3, -4, -5};
        sum(arrayOfInt);
        sum(arrayOfInt1);
        sum(arrayOfInt2);
        sum(arrayOfInt3);


    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j >= 0) {
                sum += j;
            }
        }
        System.out.println(sum);
        return Math.max(sum, 0);
    }




}


