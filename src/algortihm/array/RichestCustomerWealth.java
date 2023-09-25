package algortihm.array;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] inputDate = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                inputDate[i][j] = scanner.nextInt();
            }
        }
        int max = findWealthier(inputDate);
        System.out.println(max);
    }

    private static int findWealthier(int[][] accounts) {
        int[] sumArray = new int[accounts.length];
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                count += accounts[i][j];
            }
            sumArray[i] = count;
            count = 0;
        }
        int max = 0;
        for (int value : sumArray) {
            if (value > max) {
                max = value;
            } else {
            }

        }
        return max;
    }

//    private static int findMax(int[] values) {
//        int max = 0;
//        for (int value : values) {
//            if (value > max) {
//                max = value;
//            } else {
//            }
//        }
//        return max;
//    }
}
