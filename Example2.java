import java.util.Scanner;

public class Example2 {

    public static boolean simpleNum() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(simpleNum());
    }
}
