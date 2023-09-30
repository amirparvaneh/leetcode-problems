package algortihm.array;

import java.util.Arrays;
import java.util.Scanner;

public class HowManyNumberAreSmaller1365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputData = new int[n];
        for (int i = 0; i < n; i++) {
            inputData[i] = scanner.nextInt();
        }
        int[] result = smallerNumbersThanCurrent(inputData);
        System.out.println(Arrays.toString(result));
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] lowerValue = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[i] != nums[j] && nums[i] > nums[j]) {
                    counter += 1;
                }
            }
            lowerValue[i] = counter;
        }

        return lowerValue;
    }

}
