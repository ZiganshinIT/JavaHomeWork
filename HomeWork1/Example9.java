package HomeWork1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int stb = 1; stb <= (n / 2); stb++) {    // For the first half of matrix
            for(int str = 1; str <= stb; str++) { // 1 2 3 // 2 3 // 3
                System.out.print(stb + " ");
            }
            for(int str = stb; str < (n / 2); str++) { // 3 4 5 //
                System.out.print(str + 1 + " ");
            }
            for(int str = (n / 2) + 1; str <= n; str++) { // 5 6 7
                System.out.print(str - 1 + stb + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int stb = (n / 2) + 1; stb <= n; stb++) {  // For the second half of matrix
            for(int str = 1; str <= (n / 2); str++) {
                System.out.print(str - 1 + stb + " ");
            }
            for(int str = (n / 2) + 1; str < stb; str++) {
                System.out.print(str + " ");
            }
            for(int str = stb; str <= n; str++) {
                System.out.print(stb + " ");
            }
            System.out.println();
        }
    }
}
