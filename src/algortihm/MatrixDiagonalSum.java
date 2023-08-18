package algortihm;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        int diagonalSum = calculateDiagonalSum(mat);
        System.out.println(diagonalSum);

    }

    public static int calculateDiagonalSum(int[][] mat) {
        int sum = 0;
        int dSum= 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j ){
                    sum += mat[i][j];
                }
                if (i+j == mat.length-1 && i != j){
                    dSum = dSum+mat[i][j];
                }
            }
        }
        return sum+dSum;
    }
}
