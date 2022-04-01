import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PZ_C039 {

    public static void PZ_C039Test (String[] args) throws IOException {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int cnt = 0;

        for(int i = 0; i < line.length(); i++) {
            char n = line.charAt(i);
            if (n == '/') {
                cnt++;
            }

            else if (n == '<') {
                cnt += 10;
            }
        }
        System.out.println(cnt);
    }
}

