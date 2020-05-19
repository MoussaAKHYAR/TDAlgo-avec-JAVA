import java.util.Scanner;

public class Exo12 {
    /*
    Exercice 12 :
    Un nombre est parfait s’il est égal à la somme de ses diviseurs stricts (différents de lui-même). Ainsi par exemple,
    l’entier 6 est parfait car 6 = 1 + 2 + 3. Écrire un algorithme permettant de déterminer si un entier naturel est un nombre parfait
     */

    public static void main(String[] args) {
        int val, som, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir une valeur");
        val = scanner.nextInt();

        som = 0;
        for (i = 1; i<= val/2;i++){
            if (val%i == 0){
                som = som +i;
            }
        }
        if (val == som){
            System.out.println("le nombre "+val+" est parfait");
        }else
            System.out.println("le nombre "+val+" n'est parfait");
    }
}
