import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PZ_D039 {

    public static void PZ_D039Test (String[] args) throws IOException {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == b && b == c) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}

