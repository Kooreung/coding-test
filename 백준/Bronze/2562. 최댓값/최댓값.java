import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List list = new ArrayList();
        String condition = "";

        while ((condition = br.readLine()) != null && !condition.isEmpty()) {
            StringTokenizer st = new StringTokenizer(condition);
            list.add(Integer.parseInt(st.nextToken()));
        }

        int highest = (int) list.get(0);
        int highestIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (highest < (int) list.get(i)) {
                highest = (int) list.get(i);
                highestIndex = i;
            }
        }

        System.out.println(highest);
        System.out.println(highestIndex + 1);
        br.close();
    }
}