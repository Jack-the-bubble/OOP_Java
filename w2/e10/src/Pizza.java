import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double C = scanner.nextDouble();

        System.out.print((Math.pow(R-C, 2))/Math.pow(R, 2));
    }
}
