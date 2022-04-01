import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PZ_C049 {

    public static void PZ_C049Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] floor = new int[N + 1];
        int sum = 0;
        floor[0] = 1;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            floor[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N + 1; i++) {
            sum += Math.abs(floor[i] - floor[i - 1]);
        }

        System.out.println(sum);
    }

}
