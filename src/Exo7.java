import java.util.Scanner;

public class Exo7 {
    /*
    Exercice 7 :  Décomposition d’un montant en euros Écrire un algorithme permettant
    de décomposer un montant entré au clavier en billets de 20,
    10, 5 euros et pièces de 2, 1 euros, de façon à minimiser le nombre de billets et de pièces.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int montant, b20, b10, b5, p2 ,p1;
        do {
            System.out.println("Saisir le montant");
            montant = scanner.nextInt();
        }while (montant<=0);

        b20 = montant/20;
        b10 = (montant%20)/10;
        b5 =  ((montant%20)%10)/5;
        p2 =  (((montant%20)%10)%5)/2;
        p1 =  ((((montant%20)%10)%5)%2);

        System.out.println("le montant "+montant+" a "+b20+" billets de 20 "+b10+" billets de 10 "+b5+
                " billets de 5 "+p2+" pieces de 2 "+p1+" piece de 1");
    }
}
