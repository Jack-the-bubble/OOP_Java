import java.awt.*;
import java.util.Scanner;

public class Spy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;

        num=scanner.nextInt();

        int[] n=new int[num];
        int[] m=new int[num];

        if (num > 100)
            return;

        for (int x = 0; x < num; x++){
            n[x]=scanner.nextInt();
            m[x]=scanner.nextInt();

            if (n[x]< 2 || n[x] > 1000)
                return;
            if (m[x] < 1 || m[x] > 10000)
                return;

            int[][] Tab= new int[m[x]][2];

            int pom= m[x];


            for (int i =0;i < pom; i++){
                Tab[i][0]=scanner.nextInt();

                Tab[i][1]=scanner.nextInt();
                if (Tab[i][0] > n[x] || Tab[i][1]> n[x] || Tab[i][0]==Tab[i][1]) {
                    return;
                }
            }

        }

        for (int i=0;i < num; i++){
            int pom = n[i];
            System.out.println(pom-1);
        }



    }
}
