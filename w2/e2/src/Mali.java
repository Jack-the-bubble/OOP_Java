import java.util.Scanner;

public class Mali {
    public static void main(String[] args){
        int r, e, c;

        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 100 || n < 1)
            return;

        int[] Tab = new int[n];

        for (int i = 0; i < n; i++){
            r = scanner.nextInt();
            e = scanner.nextInt();
            c = scanner.nextInt();

            if(r < -1000000 || r > 1000000 || e < -1000000 || e > 1000000)
                return;
            if (r-(e-c) == 0)
                Tab[i]= 0;
            else if (r - (e - c) > 0)
                Tab[i]= 1;
            else
                Tab[i]= 2;
        }
        for (int i = 0; i < n; i++)
            if (Tab[i] == 0)
                System.out.println("does not matter");
            else if (Tab[i] == 1)
                System.out.println("do not advertise");
            else
                System.out.println("advertise");

    }
}
