import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String quiz = br.readLine();
            String[] quizArr = quiz.split("");
            int score = 0;
            int sum = 0;

            for (int j = 0; j < quizArr.length; j++) {
                if (quizArr[j].equals("O")) {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }
            bw.write(String.valueOf(sum) +"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}