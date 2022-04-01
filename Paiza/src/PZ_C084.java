import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PZ_C084 {
    public static void PZ_C084Test(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for (int i = 0; i < str.length() + 2; i++) {
            System.out.print("+");
        }

        System.out.print("\n");
        System.out.println("+" + str + "+");

        for (int i = 0; i < str.length() + 2; i++) {
            System.out.print("+");
        }
    }
}
