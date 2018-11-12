import java.util.Scanner;

public class Hitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, cir = 0, rec = 0;
        String word;

        m = Integer.parseInt(scanner.nextLine());
        int[] squares = new int[4*m]; //x1, y1, x2, y2
        int[] circles = new int[3*m];//x, y, r
        for (int i = 0; i < m; i++) {
            word = scanner.nextLine();
            String[] split = word.split(" ");
            if (word.contains("rectangle")) {
                squares[0+4*rec]=Integer.parseInt(split[1]);
                squares[1+4*rec]=Integer.parseInt(split[2]);
                squares[2+4*rec]=Integer.parseInt(split[3]);
                squares[3+4*rec]=Integer.parseInt(split[4]);
                rec++;
            } else if (word.contains("circle")) {
                circles[0+3*cir]=Integer.parseInt(split[1]);
                circles[1+3*cir]=Integer.parseInt(split[2]);
                circles[2+3*cir]=Integer.parseInt(split[3]);
                cir++;
            }
        }

        n = Integer.parseInt(scanner.nextLine());
        int[] points = new int[2*n];
        int[] hits = new int[n];
        for (int i = 0; i < n; i++) {
            word = scanner.nextLine();
            String[] split = word.split(" ");
            points[0+2*i]=Integer.parseInt(split[0]);
            points[1+2*i]=Integer.parseInt(split[1]);

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < rec; j++) {
                if ((points[(2 * i)] <= squares[(2 + 4 * j)]) && (points[(2 * i)] >= squares[(4 * j)]) && (points[(1 + 2 * i)] <= squares[(3 + 4 * j)]) && (points[(1 + 2 * i)] >= squares[(1 + 4 * j)]))
                    hits[i]++;

            }
            for (int j = 0; j < cir; j++) {
                if ((Math.sqrt((Math.pow((double)(points[(2*i)]-circles[(3*j)]), 2)+Math.pow((double)(points[(1+2*i)]-circles[(1+3*j)]), 2)))) <= (circles[(2+3*j)]))
                   hits[i]++;

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(hits[i]+" ");
        }

    }
}
