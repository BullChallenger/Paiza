import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PZ_C102 {
    public static void PZ_C102Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] calender = new int[31];

        int A_N = Integer.parseInt(st.nextToken());
        int A[] = new int[A_N];

        for (int i = 0; i < A_N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());

            calender[A[i] - 1] += 1;
        }

        st = new StringTokenizer(br.readLine());

        int B_N = Integer.parseInt(st.nextToken());
        int B[] = new int[B_N];

        for (int i = 0; i < B_N; i++) {
            st = new StringTokenizer(br.readLine());
            B[i] = Integer.parseInt(st.nextToken());

            calender[B[i] - 1] += 2;
        }

        int cnt = 0;

        for (int i = 0; i < calender.length; i++) {
            if (calender[i] == 0) {
                System.out.println("x");
            }

            else if (calender[i] == 3) {
                cnt++;
                if (cnt % 2 == 0) {
                    System.out.println("B");
                }
                else {
                    System.out.println("A");
                }
            }

            else if (calender[i] == 1) {
                System.out.println("A");
            }

            else if (calender[i] == 2) {
                System.out.println("B");
            }
        }
    }
}
