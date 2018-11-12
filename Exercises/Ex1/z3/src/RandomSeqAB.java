public class RandomSeqAB {
    public static void main(String[] args) {
        int N, A, B;
        A=Integer.parseInt(args[0]);
        B=Integer.parseInt(args[1]);
        N=Integer.parseInt(args[2]);

        for (int i = 0; i < N; i++)
            System.out.print(A+(int)(Math.random()*(B-A))+" ");
    }
}
