import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int timerA = a;
        int timerB = b + c;
        
        while (timerB >= 60) {
            timerB -= 60;
            timerA++;
        }

        while (timerA >= 24) {
            timerA -= 24;
        }
        
        System.out.print(timerA + " ");
        System.out.println(timerB);
    }
}

