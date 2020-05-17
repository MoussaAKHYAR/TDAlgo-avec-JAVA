import java.util.Scanner;

public class Exo5 {
    /*
    Ecrire un programme qui saisit 5 variables de type entier au clavier et qui affiche leur somme.
     Utiliser une boucle (for ou while ou do..while).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, val;
        float somme = 0;

        for (i = 1; i <= 5; i++){
            System.out.println("Entrer une valeur");
            val = scanner.nextInt();
            somme = somme + val;
        }
        System.out.println("la somme des valeurs saisies est : "+somme);
    }
}
