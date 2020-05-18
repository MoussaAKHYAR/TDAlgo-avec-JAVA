import java.util.Scanner;

public class Exo9 {
    /*
    Exercice 9 : Ecrire un algorithme qui donne la durée de vol en heure minute connaissant l'heure de départ et l'heure d'arrivée.
    a. On considère que le départ et l'arrivé ont lieu le même jour
    b. On suppose que la durée de vol est inférieure à 24 heures mais peut avoir lieu le lendemain.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hd,ha,md,ma,dha = 0,dma = 0,mg = 0;
        do {
            System.out.println("entrer l'heure de départ ");
            hd = scanner.nextInt();
            System.out.println("entrer minutes de depart");
            md = scanner.nextInt();
        }while (hd<=0 || hd >= 24 || (md <= 0 || md >60));

        do {
            System.out.println("entrer l'heure d'arrivé ");
            ha = scanner.nextInt();
            System.out.println("entrer minutes d'arrivées ");
            ma = scanner.nextInt();
        }while (ha<=0 || ha >= 24 || (ma <= 0 || ma >60));

        if(ha>hd) {
            mg = ((ha *60 + ma)- (hd *60 +md));
            dha = mg/60;
            dma = mg%60;
            System.out.println("la durée du vol est : "+dha+" Heures "+dma+" minutes ");

        }else
            System.out.println("heure d'arrivée ne peut pas etre inferieure à l'heure de départ");
    }
}
