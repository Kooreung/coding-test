import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        int earlyH = h;
        int earlyM = m - 45;

        if (earlyM < 0) {
            earlyH--;
            earlyM += 60;
        }

        if (earlyH < 0) {
            earlyH += 24;
        }

        System.out.print(earlyH + " ");
        System.out.println(earlyM);
    }
}