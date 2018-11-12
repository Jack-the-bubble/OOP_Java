import java.util.Scanner;

public class Estimate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] Tab = new int[N];
        for (int i = 0; i < N; i++) {
            Tab[i]=scanner.nextLine().length();
        }

        for (int i = 0; i < N; i++) {
            System.out.println(Tab[i]);
        }
    }
}
