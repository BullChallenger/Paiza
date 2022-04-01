import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PZ_D012 {

    public static void PZ_D012Test (String[] args) throws IOException {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n < 0) {
            System.out.println(n*-1);
        }

        else {
            System.out.println(n);
        }
    }
}

