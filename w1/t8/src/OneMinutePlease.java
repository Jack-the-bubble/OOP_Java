import java.util.Scanner;

public class OneMinutePlease {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i, M, S;
        M=0;
        S=0;
        if (S>3600)
            return;
        if (M>60)
            return;
        double minute;
        i=scanner.nextInt();

        for (int x=0;x<i;x++) {
            M = M + scanner.nextInt();
            S = S + scanner.nextInt();
        }
        minute=(S/60.0)/M;
        if (minute>1)
            System.out.println(minute);
        else
            System.out.println("\"measurement error\"");
    }
}
