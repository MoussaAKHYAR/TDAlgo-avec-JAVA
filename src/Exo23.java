import java.util.Scanner;

public class Exo23 {
    /*

     */
    public static void main(String[] args) {
        int n,cpt=0,F=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Entrez la longueur");
            n = sc.nextInt();
        } while (n <= 0 || n > 100);

        for(int i=0;i<n;i++){
            if(i==0 || i==1){
                F=2;
            }else {
                for(int j=2;j<n-2;j++){
                    if(j%2==0){
                        F=F+j;
                    }
                }
            }

            System.out.println("Mois "+i+" ="+F);
        }

    }

}
