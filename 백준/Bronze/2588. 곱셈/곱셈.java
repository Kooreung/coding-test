import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int answer1,answer2,answer3,answer4;

            answer1 = A * (B % 10);
            answer2 = A * (B % 100 / 10);
            answer3 = A * (B / 100);
            answer4 = A * B;

            System.out.println(answer1);
            System.out.println(answer2);
            System.out.println(answer3);
            System.out.println(answer4);
        }
}
