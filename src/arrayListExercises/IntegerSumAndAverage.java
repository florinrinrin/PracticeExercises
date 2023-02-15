package arrayListExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerSumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int integer;
        int sum = 0;
        int count = 0;
        double average = 0;

        do {
            System.out.print("Insert next integer: ");
            integer = scanner.nextInt();
            if(integer >= 0) {
                integerArrayList.add(integer);
                sum += integer;
                count++;
            }
        } while (integer > 0);

        average = (double)sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
