import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String[] bSplit = b.split("");
        int i = Integer.parseInt(a) * Integer.parseInt(bSplit[2]);
        int j = Integer.parseInt(a) * Integer.parseInt(bSplit[1]);
        int k = Integer.parseInt(a) * Integer.parseInt(bSplit[0]);
        int l = Integer.parseInt(a) * Integer.parseInt(b);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
    }
}