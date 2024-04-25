import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int min = 0;

        if (t % 5 == 0) {
            System.out.println(t / 5);
        } else {
            System.out.println((t / 5) + 1);
        }
    }
}