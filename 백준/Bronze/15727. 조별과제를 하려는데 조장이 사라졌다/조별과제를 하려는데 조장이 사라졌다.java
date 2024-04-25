import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int min = 0;

        while (t > 0) {
            if (t >= 5) {
                min += t / 5;
                t = t % 5;
            }
            if (t == 4) {
                min += t / 4;
                t = t % 4;
            }
            if (t == 3) {
                min += t / 3;
                t = t % 3;
            }
            if (t == 2) {
                min += t / 2;
                t = t % 2;
            }
            if (t == 1) {
                min += t / 1;
                t = t % 1;
            }
            if (t == 0) {
                break;
            }
        }
        System.out.println(min);
    }
}