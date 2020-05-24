import java.util.Scanner;

public class Exo15 {
    /*
    Exercice 15 : Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu'à ce nombre.
    Par exemple si l'on tape 4 , l’algorithme doit calculer: 1 + 2 + 3+ 4 = 10 Réécrire l'algorithme qui calcule cette fois la moyenne !
     */
    public static void main(String[] args) {
        int i,som = 0,n;
        float moy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir le nombre de départ ");
        n = scanner.nextInt();

       /* for (i = 1; i <= n; i++){
            som = som + i;
        }
        System.out.println("la somme des valeurs comprises entre 1 et "+n+" est : "+som);*/
        for (i = 1; i <= n; i++){
            som = som + i;
        }
        moy = som/n;
        System.out.println("la moyenne est : "+moy);
    }
}
