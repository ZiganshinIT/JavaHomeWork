import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        int n = 1, x = 0;
        x = sc.nextInt(); // 1
        while(x != 0) { // 1 != 0
            n = sc.nextInt(); // 2
            if (x > n) { // 1 > 2
                x = n;		// comparison 2
                System.out.println("1st while " + x);
                break;

            }
            x = n; // 2
        }
        while(x != 0) {
            n = sc.nextInt(); // 3
            if (x < n && n != 0) { // 2 < 3 3 < 2
                System.out.println("Error");
                break;
            }
            System.out.println("2st while " + x);
            x = n;
        }
        if (n == 0) {
            System.out.println("Right");
        }
    }
}
