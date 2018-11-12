import java.util.Arrays;
import java.util.Scanner;

public class Unlock {

    public static int find(int[] table, int num) {
        for (int i = 0; i < 9; i++) {
            if (num == table[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Tab = new int[9];
        double dist = 0, j;
        int x1, x2, y1, y2;
        for (int i = 0; i < 9; i++) {
            Tab[i] = scanner.nextInt();
        }
        j = 1;
        for (int i = 1; i < 9; i++) {
            x2 = find(Tab, (i+1));
            y2 = (int)(x2/3);
            x2 = x2%3;
            x1 = find(Tab, i);
            y1 = x1/3;
            x1 = x1%3;
            x1 = x2 - x1;
            y1 = y2 - y1;
            dist+=Math.sqrt(Math.pow((double)x1, 2)+Math.pow((double)y1, 2));
            j++;
        }

        System.out.print(dist);

    }
}
