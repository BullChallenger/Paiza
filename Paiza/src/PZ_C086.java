import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PZ_C086 {

    public static void PZ_C086Test (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) != 'a' && S.charAt(i) != 'e' && S.charAt(i) != 'i' && S.charAt(i) != 'o' && S.charAt(i) != 'u'
            && S.charAt(i) != 'A' && S.charAt(i) != 'E' && S.charAt(i) != 'I' && S.charAt(i) != 'O' && S.charAt(i) != 'U')
            {
                sb.append(S.charAt(i));
            }
        }

        System.out.println(sb);

    }
}
