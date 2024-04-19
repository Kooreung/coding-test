import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        int N = 30;
        List list = new ArrayList();
        List notList = new ArrayList();

        while ((s = br.readLine()) != null && !s.isEmpty()) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        for (int i = 1; i <= N; i++) {
            if (!list.contains(i)) {
                notList.add(i);
            }
        }

        Collections.sort(notList);
        for (int i = 0; i < notList.size(); i++) {
            bw.write(notList.get(i) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}