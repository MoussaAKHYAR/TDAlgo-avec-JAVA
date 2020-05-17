import java.util.Scanner;

public class Exo4 {
    /*
    Exercice 4
    Ecrire un programme qui saisit un réel x et un entier n et affiche x à la puissance n.
    Version 1 : utiliser la fonction pow  du fichier d’en-tête <math.h>  ex : pow(x,n)
    Version 2 : en utilisant un boucle

     */
    public static void main(String[] args) {
        float nombre,res;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre");
        nombre = scanner.nextFloat();
        System.out.println("entrer la puissance");
        n = scanner.nextInt();
        res = (float) Math.pow(nombre,n);
        System.out.println("le résultat du nombre "+nombre+"puissance"+n+" est :"+res);
    }
}
