package tinkoff;

import java.util.Scanner;

public class qa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int i = 0;

        int visitors = scanner.nextInt();
        int[] visitor = new int[visitors + 2];

        do {
            visitor[i] = scanner.nextInt();
            i++;
        } while (i != visitors + 2);
        scanner.close();
        if (visitor[0] > visitor[visitor[visitors + 1]] - visitor[1]) {
            result = visitor[visitors] - visitor[1];
        } else {
            if (visitor[visitor[visitors + 1]] - visitor[1] < visitor[visitors] - visitor[visitor[visitors + 1]]) {
                result = (visitor[visitor[visitors + 1]] - visitor[1]) * 2 + visitor[visitors] - visitor[visitor[visitors + 1]];
            } else {
                result = (visitor[visitor[visitors + 1]] - visitor[1]) + 2 * (visitor[visitors] - visitor[visitor[visitors + 1]]);
            }

        }
        System.out.println(result);
    }
}
