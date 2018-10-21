import java.util.Scanner;

public class TimeLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x;
        x=scanner.nextInt();
        if(x>100||x<1)
            return;
        for (int i=1;i<=x;i++)
            System.out.println(i+" Abracadabra");
    }
}
