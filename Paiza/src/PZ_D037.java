import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PZ_D037 {

    public static void PZ_037Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if(n%m != 0) {
            System.out.println(n/m + 1);
        }

        else {
            System.out.println(n/m);
        }

    }
}

