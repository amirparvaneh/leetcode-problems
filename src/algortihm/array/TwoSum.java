package algortihm.array;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] inputArray1 = {2, 7, 11, 15};
        int[] inputArray2 = {3, 2, 4};
        int[] inputArray3 = {2, 5, 5, 11};
//        Scanner scanner = new Scanner(System.in);
//        int target = scanner.nextInt();
        int target1 = 9;
        int target2 = 6;
        int target3 = 10;
        int[] indexes1 = twoSumUsingHashMap(inputArray1, target1);
        int[] indexes2 = twoSumUsingHashMap(inputArray2, target2);
        int[] indexes3 = twoSumUsingHashMap(inputArray3, target3);
        System.out.println(Arrays.toString(indexes1));
        System.out.println(Arrays.toString(indexes2));
        System.out.println(Arrays.toString(indexes3));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }else
                map.put(nums[i],i);
        }
        return result;
    }

}
