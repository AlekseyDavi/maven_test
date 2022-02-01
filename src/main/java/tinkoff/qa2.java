package tinkoff;

import java.util.Scanner;


public class qa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int visitor = scanner.nextInt();
        scanner.close();
        int result = 0;
        double a= visitor;

        do {
            a =Math.ceil( a / 2);

            result++;
        } while (Math.ceil(a) != 1 );
        System.out.println(result);
    }
}
