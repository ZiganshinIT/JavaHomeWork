import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
