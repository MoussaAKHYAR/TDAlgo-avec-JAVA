import java.util.Scanner;

public class Exo19 {
    /*
    Exercice 19 : Ecrire l’algorithme qui affiche la somme des prix d'une suite d'articles en CFA (entiers)
    saisies par l'utilisateur et se terminant par zéro.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prixArticle,som,rep;
        som = 0;
        do {
            System.out.println("saisir le prix de l'article ");
            prixArticle = scanner.nextInt();
            som = som + prixArticle;
            System.out.println("voulez saisir un autre article ? tapez 0 pour terminer ");
            rep = scanner.nextInt();
        }while (rep != 0);
        System.out.println("la somme des prix des articles est : "+som);
    }
}
