import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long count = 1;

        for (int i = N; i >= 1; i--) {
            count *= i;
        }

        System.out.println(count);
    }
}