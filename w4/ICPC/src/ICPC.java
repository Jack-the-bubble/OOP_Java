import java.util.Scanner;

public class ICPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), winners = 0;
        String[] tab = new String[num*2];
        for (int i = 0; i < 24; i++) {
            tab[i] = scanner.next();
            winners++;
            for (int j = 0; j < i - 1; j++) {
                if (tab[j].matches(tab[i])) {
                    tab[i] = scanner.next();
                    i--;
                    winners-=2;
                    break;
                }
            }
            if (winners == 24) {
                break;
            }
        }

        for (int i = 0; i < 24; i += 2) {
            System.out.println(tab[i]+" " + tab[i+1]);
        }
    }
}
