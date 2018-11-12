import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String word = scanner.next();
        int length = word.length(), days = 0;
        char[] tab = word.toCharArray();

        for (int i = 0; i < length-2; i = i + 3) {
            if (tab[i] != 'P')
                days++;
            if (tab[i+1] != 'E')
                days++;
            if (tab[i+2] != 'R')
                days++;
        }

        System.out.println(days);
    }
}
