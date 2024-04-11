package algortihm.array;


import java.util.Objects;

public class LongestComPref {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String res = findLongestCommonPrefix(input);
        System.out.println(res);
    }


    public static String findLongestCommonPrefix(String[] input) {
        if (input.length == 0) {
            return "";
        }

        String prefix = input[0];
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < prefix.length(); j++) {
                if (j == input[i].length() || prefix.charAt(j) != input[i].charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }
        return prefix;
    }
}
