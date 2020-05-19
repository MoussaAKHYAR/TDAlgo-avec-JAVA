import java.util.Scanner;

public class Exo10 {
    /*
    Exercice 10 : Ecrire un algorithme qui lit trois valeurs entières ( A, B et C)
    et qui permet de les trier par échanges successifs Et enfin les afficher dans l'ordre 4.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,tmp,min;
        int tab[]  = new int[4] ;

        for (i = 1; i <= 3; i++){
            System.out.println("Saisir une valeur ");
            tab[i] = scanner.nextInt();
        }
        for (i = 1; i<= 2; i++){
            min = i;
            for (j = i + 1; j <= 3;j++){
                if(tab[j]<tab[min]){
                    min = j;
                }
            }
            if (min != i){
                tmp = tab[min];
                tab[min] = tab[i];
                tab[i] = tmp;
            }
        }
        System.out.println("les valeurs aprés tri sont :");
        for (i = 1; i<= 3; i++){
            System.out.print(+tab[i]+"|");
        }
    }
}
