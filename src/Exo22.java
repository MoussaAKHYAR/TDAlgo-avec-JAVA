import java.util.Scanner;

public class Exo22 {
    public static void main(String[] args) {
        int n,i,pos,seq,longueur;
        int tab[] = new int[50];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("entrer la valeur de N entiers compris entre 10 et 50");
            n = scanner.nextInt();
        }while (n < 10 || n > 50 );
        seq = 0;
        pos = 0;
        longueur = 1;

        for (i = 1; i<= n ;i++) {
            System.out.println("saisir une valeur ");
            tab[i] = scanner.nextInt();
        }
        for (i=1; i<=n;i++){
            if (tab[i] < tab[i+1]){
                seq += 1;
                if (seq > longueur){
                    longueur = seq;
                    pos = (i + 1) - longueur + 1;
                }

            }else seq = 1;
        }
        System.out.println("la plus longue séquence est : "+longueur+" qui commence à la position "+pos);
    }
}
