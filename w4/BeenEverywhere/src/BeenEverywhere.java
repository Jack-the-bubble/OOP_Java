import java.util.Scanner;

public class BeenEverywhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int was;
        int[] sum = new int[t];
        for (int i = 0; i < t; i++) {
            int n  = scanner.nextInt();
            String[] tab = new String[n];
            for (int j = 0; j < n; j++) {
                was = 0;
                tab[j]=scanner.next();
                for (int k = 0; k < j; k++) {
                    if (tab[j].matches(tab[k])) {
                     was = 1;
                     break;
                    }
                }
                if (was == 0) {
                    sum[i]++;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(sum[i]);
        }
    }
}
