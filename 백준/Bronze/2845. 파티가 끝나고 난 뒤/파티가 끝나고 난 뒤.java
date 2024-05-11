import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st1.nextToken());
        int P = Integer.parseInt(st1.nextToken());
        int people = L * P;

        int[] compare = new int[5];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < compare.length; i++) {
            compare[i] = Integer.parseInt(st2.nextToken()) - people;
        }

        System.out.println(compare[0] + " " + compare[1] + " " + compare[2] + " " + compare[3] + " " + compare[4]);

        br.close();
    }
}