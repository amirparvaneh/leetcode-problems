package algortihm.array;

import java.util.Arrays;
import java.util.Scanner;

public class HeightsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputDate = new int[n];
        for (int i = 0; i < n; i++) {
            inputDate[i] = scanner.nextInt();
        }
        int result = heightChecker(inputDate);
        System.out.println(result);
    }

    private static int heightChecker(int[] data) {
        int repeatedNumber = 0;
        int[] expectedArray = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            expectedArray[i] = data[i];
        }
        Arrays.sort(expectedArray);
        System.out.println(Arrays.toString(expectedArray));
        for (int i = 0; i < data.length; i++) {
            if (expectedArray[i] != data[i]) {
                repeatedNumber += 1;
            }
        }
        return repeatedNumber;
    }


}
