import java.util.Scanner;
/*
Exercice 6 :
Faire un programme qui saisit  les coordonnées de 2 points A (x1, y1) et b(x2, y2) et qui affiche la distance entre les 2 points.
Formule : distante = racine carrée de ((x1 – x2)2  + (y1 – y2)2)
 Racine carrée : sqrt. Ex : sqrt(7) ; <math.h>

 */

public class Exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1,y1,x2,y2;
        double d,c;

        System.out.println("saisir les coordonnées du point A(X1,Y1)");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.println("saisir les coordonnées du point B(X2,Y2)");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        c = (Math.pow((x1 - x2),2) +Math.pow((y1 - y2),2));
        d =  Math.sqrt(c);
        System.out.println("la distance entre les point A et B est :"+d);
    }
}
