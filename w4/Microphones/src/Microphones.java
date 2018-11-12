import java.util.Scanner;

public class Microphones {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String string=scanner.nextLine();
        if (string.contains("ss")){
            System.out.print("hiss");
        }
        else
            System.out.print("no hiss");
    }

}
