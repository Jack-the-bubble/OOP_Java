import java.util.Scanner;

public class Chess {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int[] Tab= new int[6];
        for (int i=0; i<6; i++)
            Tab[i]=scanner.nextInt();
        Tab[0]=1-Tab[0];
        Tab[1]=1-Tab[1];
        Tab[2]=2-Tab[2];
        Tab[3]=2-Tab[3];
        Tab[4]=2-Tab[4];
        Tab[5]=8-Tab[5];
        for (int i=0; i<6; i++)
            System.out.print(Tab[i]+" ");
    }
}
