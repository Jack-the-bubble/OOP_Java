import java.util.Scanner;

public class Journal {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int I, A;
        I=scanner.nextInt();
        A=scanner.nextInt();
        System.out.println(((A-1)*I)+1);
    }
}
