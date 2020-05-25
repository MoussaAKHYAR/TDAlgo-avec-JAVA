import java.util.Scanner;

public class Exo23 {
    /*

     */
    public static void main(String[] args) {
        int u = 2 ,v = 2,w,N,i;
        final int MLLD = 1000000000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez N : ");
        N = sc.nextInt();
        w = 2;
        for (i = 2; i <= N; i++){
            w = u +v;
            u = v;
            v = w;
        }
        System.out.println("F"+N+" = "+w);
        int FN = 2;
        while(FN <= MLLD) {
            N = N + 1;
            FN = v + u;
            v = u;
            u = FN;
        }

        System.out.println("le nombre de depasse " + MLLD + " au bout de " + N +" mois");

    }

}
