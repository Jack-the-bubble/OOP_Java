import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Parking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int c, dist;
        for (int i = 0; i < N; i++){
            c= scanner.nextInt();
            int[] Tab = new int[c];
            for (int x = 0; x < c; x++) {
                Tab[x] = scanner.nextInt();

            }
            Arrays.sort(Tab);

            dist = 0;
            for (int x = 0; x < c -1; x++)
                dist += Tab[x+1]-Tab[x];
            dist += Tab[c-1]-Tab[0];

            System.out.println(dist);
        }
    }
}
