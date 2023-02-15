package arrayListExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerSumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int integer;
        int sum = 0;
        double average = 0;

        do {
            System.out.print("Insert next integer: ");
            integer = scanner.nextInt();
            if(integer >= 0) {
                integerArrayList.add(integer);
            }
        } while (integer > 0);
        for (Integer value : integerArrayList) {
            System.out.println(integerArrayList);
            sum += value;
        }
            average = (double)sum / integerArrayList.size();
                System.out.println("The sum is: " + sum);
                System.out.println("The average is: " + average);
    }
}
