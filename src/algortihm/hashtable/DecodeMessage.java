package algortihm.hashtable;

import java.util.Scanner;

public class DecodeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String message = scanner.nextLine();
        String result = decodeMessage(key,message);
        System.out.println(result);
    }

    public static String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        char[] keyToActual = new char[128];
        keyToActual[' '] = ' ';
        char currChar = 'a';

        for (final char c : key.toCharArray())
            if (keyToActual[c] == 0)
                keyToActual[c] = currChar++;

        for (final char c : message.toCharArray())
            sb.append(keyToActual[c]);

        return sb.toString();
    }
}



