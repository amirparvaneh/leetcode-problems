package algortihm;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int n) {
        boolean result = false;
        if (n != 0){
            while (n % 2 == 0) {
                n = n / 2;
            }
            if (n == 1) {
                result = true;
            } else result = false;
        }
        return result;
    }
}