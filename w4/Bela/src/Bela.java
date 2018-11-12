import java.util.Scanner;

public class Bela {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int n = scanner.nextInt(), sum = 0;
        char S = scanner.next().charAt(0);
        int num = n*8;
        char[] tab = new char[n*8];

        for (int i = 0; i < num; i+=2) {
            char[] pom = new char[2];
            pom = scanner.next().toCharArray();
            tab[i] = pom[0];
            tab[i+1] = pom[1];

        }
        for (int i = 0; i < num; i+=2) {
            if (tab[i] == 'J') {
                if (tab[i + 1] == S)
                    sum += 20;
                else
                    sum += 2;
            }
            if (tab[i] == '9') {
                if (tab[i + 1] == S)
                    sum += 14;
            }
            switch (tab[i]) {
                case 'A':
                    sum += 11;
                    break;
                case 'K':
                    sum += 4;
                    break;
                case 'Q':
                    sum += 3;
                    break;
                case 'T':
                    sum += 10;
            }
        }
        System.out.println(sum);

    }
}
