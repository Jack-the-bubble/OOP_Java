import java.util.Scanner;

public class Matches {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        int W =scanner.nextInt();
        int H = scanner.nextInt();
        int pom;

        if (N > 50 || N < 1 || W > 100 || W < 1 || H > 100 || W <1) {
            return;
        }

        boolean[] Tab = new boolean[N];

        for (int i = 0; i < N; i++){
            pom=scanner.nextInt();
            if (pom*pom > (W*W+H*H))
                Tab[i]=false;
            else
                Tab[i]=true;
        }
        for (int i = 0; i < N; i++){
            if (Tab[i])
                System.out.println("DA");
            else
                System.out.println("NE");
        }

    }
}
