import java.util.Scanner;

public class Exo21 {
    /*
    Exercice 21 : Ecrire un algorithme mettant en œuvre le jeu suivant entre deux joueurs : Le premier utilisateur saisi un entier
     que le second doit deviner. Pour cela, il a le droit à autant de tentatives qu'il souhaite. A chaque échec, le programme
      lui indique si l'entier est plus grand ou plus petit que sa proposition.Un score est affiché lorsque l'entier est trouvé.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Entrer la valeur du premier utilisateur ");
        a = scanner.nextInt();

        System.out.println("Deviner la valeur du premier utilisateur ");
        b = scanner.nextInt();
        while (a != b) {
          if (a > b) {
                System.out.println("la valeur saisie est plus petite");
          } else
                System.out.println("la valeur saisie est plus grande");
          System.out.println("Deviner la valeur du premier utilisateur ");
          b = scanner.nextInt();

        }
        System.out.println("Bravo vous avez trouvé !!!!!!!");

    }
}
