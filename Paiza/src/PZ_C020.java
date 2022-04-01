import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PZ_C020 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        double firstNokori = m - (m * p / 100.0);
        double lastNokori = firstNokori - ((firstNokori/100) * q) ;

        System.out.println(Math.round(lastNokori * 10000) / 10000.0);

    }

}
