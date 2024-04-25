import java.time.LocalDate;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getMonth().getValue());
        System.out.println(LocalDate.now().getDayOfMonth());
    }
}