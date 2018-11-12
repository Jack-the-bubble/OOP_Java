import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Scanner;

public class RacingAlphabet {
    public static double distance(int a, int b) {
        int x = a;
        int y = b;
        double dist;
        if (x == 44) {
            x = 92;
        } else if (x == 32) {
            x = 91;
        }
        if (Math.abs(y - x )> 14) {
            dist = Math.abs((28 - y) + x);
        } else {
            dist = (double) Math.abs(y - x);
        }
        dist = Math.PI*2*dist/28;;

        return dist;
    }

    public static void main(String[] args) {
        int rad = 30;
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double[] times = new double[n];
        for (int j = 0; j < n; j++) {
            double result = 0;
            String phrase = scanner.nextLine();

            for (int i = 0; i < phrase.length() - 1; i++) {
                result+=distance((int)phrase.charAt(i), (int)phrase.charAt(i+1));
            }
            times[j] = result;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(times[i]);
        }


    }
}
