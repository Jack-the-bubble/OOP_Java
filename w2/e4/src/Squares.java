import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 4;
        int N = scanner.nextInt();
        sum=(int)Math.pow(Math.pow(2, N)+1, 2);

        System.out.print(sum);

    }

}
