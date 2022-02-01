package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class qa9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j = n - 1;
        int result = 0;
        int[] price = new int[n];
        int[] sortPrice = new int[n];
        int[] numberPriceUnder100 = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = scanner.nextInt();
            sortPrice[i] = price[i];
        }
        scanner.close();
        Arrays.sort(sortPrice);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            while (sortPrice[n - 1] == price[i] & price[i] > 100) {
                for (int k = i; sortPrice[n - 2] != price[k]; k++) {
                    price[k] = 0;
                }
                sortPrice[n - 1] = 0;
                sortPrice[n - 2] = 0;
                Arrays.sort(sortPrice);
            }
            while (price[i] > 100) {
                for (int k = i; sortPrice[n - 1] != price[k]; k++) {
                    price[k] = 0;
                }
                sortPrice[n - 1] = 0;
                Arrays.sort(sortPrice);
            }
            while (price[i] != 0) {
                for (int k = 0; sortPrice[k] != price[i]; k++) {
                    sortPrice[k] = 0;
                }
                Arrays.sort(sortPrice);
            }

        }
        System.out.println(result);
    }
}
