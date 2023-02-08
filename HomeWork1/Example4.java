package HomeWork1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	// 1				// input n
        int max = n, min = n;		// 1 1			// n is assigned max and min
        int cm = 0, res = 0;
        n = sc.nextInt(); // 2
        while (n != 0) {
            if (n > max) { // 2 > 1
                max = n;	// 2			// n is assigned max
                cm = 0;
                n = sc.nextInt();
                continue;
            }
            else if (n < min) {
                min = n;				// n is assigned min
                res = cm;
            }
            cm += n;
            n = sc.nextInt();
        }
        System.out.println("\n" + res);
    }
}
