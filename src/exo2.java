import java.util.Scanner;

public class exo2 {
/*
Exercice 2
Ecrire un programme qui demande à l’utilisateur de donner le rayon d’un cercle et lui retourne sa surface et son périmètre.
PI =  4 * arc tangeante de 1. la fonction arc tangeante est atan ex : atan(2).
 */

public static void main(String[] args) {
    final float pi = (float) (4 * Math.atan(1));
    float r,s,p;
    Scanner scanner = new Scanner(System.in);

    System.out.println("saisir le rayon de la surface ");
    r = scanner.nextFloat();
    s = r*r*pi;
    p = 2*r*pi;

    System.out.println("la surface du cercle est : "+s+" m2");
    System.out.println("le perimetre du cercle est : "+p+" m");
}
}
