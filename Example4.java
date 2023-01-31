import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
                sum = 0;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
