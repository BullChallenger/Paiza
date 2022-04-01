import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PZ_B103 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] location = new int[3];
        int[] jungle = new int[201];

        int red = 0;
        int green = 0;
        int blue = 0;

        int assemble = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            location[i] = Integer.parseInt(st.nextToken());
            if(i == 0) {
                red = location[i] + 100;
                jungle[red] += 1;
            }

            else if(i == 1) {
                green = location[i] + 100;
                jungle[green] += 2;
            }

            else if(i == 2) {
                blue = location[i] + 100;
                jungle[blue] += 3;
            }
        }

        System.out.println(Arrays.toString(jungle));

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String side = st.nextToken();
            String color = st.nextToken();

            if (side.equals("R")) {
                if (color.equals("R")) {
                    jungle[red] -= 1;
                    jungle[red + 1] += 1;
                    red += 1;
                }

                else if (color.equals("Y")) {
                    jungle[red + 1] += 1;
                    jungle[red] -= 1;
                    red += 1;
                    jungle[green + 1] += 2;
                    jungle[green] -= 2;
                    green += 1;
                }

                else if (color.equals("M")) {
                    jungle[red] -= 1;
                    jungle[red + 1] += 1;
                    red += 1;
                    jungle[blue] -= 3;
                    jungle[blue + 1] += 3;
                    blue += 1;
                    System.out.println(Arrays.toString(jungle));
                }

                else if (color.equals("G")) {
                    jungle[green] -= 2;
                    jungle[green + 1] += 2;
                    green += 1;
                    System.out.println(Arrays.toString(jungle));
                }

                else if (color.equals("B")) {
                    jungle[blue] -= 3;
                    jungle[blue + 1] += 3;
                    blue += 1;
                }

                else if (color.equals("W")) {
                    jungle[red] -= 1;
                    jungle[red + 1] += 1;
                    red += 1;
                    jungle[green] -= 2;
                    jungle[green + 1] += 2;
                    green += 1;
                    jungle[blue] -= 3;
                    jungle[blue + 1] += 3;
                    blue += 1;
                }

                else if (color.equals("C")) {
                    jungle[green] -= 2;
                    jungle[green + 1] += 2;
                    green += 1;
                    jungle[blue] -= 3;
                    jungle[blue + 1] += 3;
                    blue += 1;
                }

            }

            else if (side.equals("L")) {
                if (color.equals("R")) {
                    jungle[red] -= 1;
                    jungle[red - 1] += 1;
                    red -= 1;
                }

                else if (color.equals("Y")) {
                    jungle[red] -= 1;
                    jungle[red - 1] += 1;
                    red -= 1;
                    jungle[green] -= 2;
                    jungle[green - 1] += 2;
                    green -= 1;
                }

                else if (color.equals("M")) {
                    jungle[red] -= 1;
                    jungle[red - 1] += 1;
                    red -= 1;
                    jungle[blue] -= 3;
                    jungle[blue - 1] += 3;
                    blue -= 1;
                }

                else if (color.equals("G")) {
                    jungle[green] -= 2;
                    jungle[green - 1] += 2;
                    green -= 1;
                    System.out.println(Arrays.toString(jungle));
                }

                else if (color.equals("B")) {
                    jungle[blue] -= 3;
                    jungle[blue - 1] += 3;
                    blue -= 1;
                }

                else if (color.equals("W")) {
                    jungle[red] -= 1;
                    jungle[red - 1] += 1;
                    red -= 1;
                    jungle[green] -= 2;
                    jungle[green - 1] += 2;
                    green -= 1;
                    jungle[blue] -= 3;
                    jungle[blue - 1] += 3;
                    blue -= 1;
                }

                else if (color.equals("C")) {
                    jungle[green] -= 2;
                    jungle[green - 1] += 2;
                    green -= 1;
                    jungle[blue] -= 3;
                    jungle[blue - 1] += 3;
                    blue -= 1;
                }
            }
            if(assemble == 0) {
                for (int j = 0; j < jungle.length; j++) {
                    if (jungle[j] == 6) {
                        assemble = j - 100;
                    }
                }
            }
        }
        if (assemble > 0) {
            System.out.println(assemble);
        }
        else if (assemble == 0) {
            System.out.println("no");
        }
    }
}
