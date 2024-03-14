import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long A = scanner.nextLong();
        Long B = scanner.nextLong();
        Long C = scanner.nextLong();
        Long answer = A + B + C;

        System.out.println(answer);
    }
}
