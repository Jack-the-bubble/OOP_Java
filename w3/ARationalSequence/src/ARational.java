import java.util.Scanner;

public class ARational {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        long[] numerator = new long[p];
        long[] denominator = new long[p];
        int[] Tab = new int[p];
        for (int i = 0; i < p; i++) {
            Tab[i] = scanner.nextInt();
            int n = scanner.nextInt();
            int subtractor = 1;
            int level = 0;
            int pom = n;
            while (pom > 0) {
                level++;
                pom-=subtractor;
                subtractor*=2;
            }
            pom+=(subtractor/2);
            int[] tree = new int[level-1];
            for (int j = level-2; j == 0; j--) {
                if (pom%2 == 1) {
                    tree[j] = 1;
                }
                else
                    tree[j] = 0;
                pom = (int)(pom+1)/2;

            }


        }
    }
}
