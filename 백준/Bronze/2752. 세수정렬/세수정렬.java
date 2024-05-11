import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int[] sortedArr;

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        sortedArr = Arrays.stream(arr).sorted().toArray();

        System.out.println(sortedArr[0] + " " + sortedArr[1] + " " + sortedArr[2]);
        
        br.close();
    }
}