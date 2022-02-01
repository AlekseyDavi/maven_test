package tinkoff;

import java.util.Scanner;
import java.util.Arrays;

public class qa4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] results = new int[n * 4];
        int k = scanner.nextInt();
        int value = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 10) {
                results[value] = 9 - numbers[i];
                value++;
            } else if (numbers[i] < 100) {
                results[value] = (int) (9 - Math.floor(numbers[i] / 10)) * 10;
                value++;
                results[value] = 9 - numbers[i] - results[value - 1];
                value++;
            } else if (numbers[i] < 1000) {
                results[value] = (int) (9 - Math.floor(numbers[i] / 100)) * 100;
                value++;
                results[value] = (int) (9 - Math.floor((numbers[i] - results[value - 1]) / 10)) * 10;
                value++;
                results[value] = 9 - numbers[i] - results[value - 1];
                value++;
            } else {
                results[value] = 8000;
                value++;
                results[value] = 900;
                value++;
                results[value] = 90;
                value++;
                results[value] = 9;
                value++;
            }
        }

        Arrays.sort(results);
        long result = 0;
        for (int i = n * 4 - k + 1; i < n * 4; i++) {
            result += results[i];
        }
        System.out.println(result);

    }
}

