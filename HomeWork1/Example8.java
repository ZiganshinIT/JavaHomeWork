package HomeWork1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(j + " ");
                }

            }
            System.out.println("");
        }
    }
}
