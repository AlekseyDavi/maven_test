package tinkoff;

import java.util.Scanner;

public class qa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] words = word.split(" ");
        int[] number = new int[4];
        for (int i = 0; i < 4; i++) {
            try {
                number[i] = Integer.parseInt(words[i]);
            } catch (NumberFormatException e) {
            }
            if (i == 3) {
                scanner.close();
            }
        }


        int result;
        if (number[3] - number[1] > 0) {
            result = number[0] + (number[3] - number[1]) * number[2];
        } else {
            result = number[0];
        }
        System.out.println(result);
    }
}

