import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i + (n - 1); j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
