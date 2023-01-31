import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int sum = 0;
        for(int k = 1; k <= n; k++) {
            sum += Math.pow(x, 3*k) / Math.pow(k, 2 * k);
        }
        System.out.println(sum);
    }
}
