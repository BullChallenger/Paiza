import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PZ_C097 {

    public static void PZ_C097Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int candidate = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= candidate; i++) {
            if (i % A == 0 && i % B == 0) {
                System.out.println("AB");
            }

            else if (i % A == 0) {
                System.out.println("A");
            }

            else if (i % B == 0) {
                System.out.println("B");
            }

            else {
                System.out.println("N");
            }
        }
    }
}
