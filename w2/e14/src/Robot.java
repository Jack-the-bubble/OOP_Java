import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w, l, y, n;
        String x;
        int startX = 0;
        int startY = 0;

        for (int i = 0; i < 100; i++){
            n = scanner.nextInt();
            w = scanner.nextInt();
            l = scanner.nextInt();

            if (w == 0 && l == 0)
                return;

            for (int a = 0; a < n; a++){
                x = scanner.nextLine();
                y = scanner.nextInt();
            }

            switch (x) {
                case "u":
                    startY += y;
                    break;
                case "d":
                    startY -= y;
                    break;
                case "l":
                    startX -= y;
                    break;
                case "r":
                    startX += y;
                 default:
                     return;
            }

        }
    }
}
