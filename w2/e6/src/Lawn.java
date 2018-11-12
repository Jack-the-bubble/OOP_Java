import java.util.Scanner;

public class Lawn {
    public static void main(String[] args){
        double w, h;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        double C = scanner.nextDouble();
        int L = scanner.nextInt();
        int[] Tab = new int[L];
        for (int i = 0; i < L; i++){
            w = scanner.nextDouble();
            h = scanner.nextDouble();
            sum += w*h*C;
        }
        System.out.print(sum);
    }
}
