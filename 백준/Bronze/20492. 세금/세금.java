import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = (int) (N * 0.78);
        int B = (int) ((int) (N * 0.80) + ((N * 0.20) * 0.78));

        System.out.println(A + " " + B);
    }
}