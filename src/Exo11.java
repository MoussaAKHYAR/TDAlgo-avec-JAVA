import java.util.Scanner;

public class Exo11 {
    /*
    Exercice 11 : Ecrire un algorithme calculatrice permettant la saisie du premier entier (a)
    de l'opération ( + ou – ou * ou / : sont des caractères) et du deuxième entier (b) et qui affiche le résultat.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        char op ;
        String ch;
        System.out.println("********************************************************");
        System.out.println("********************************************************");
        System.out.println("******************CALCULATRICE**************************");
        System.out.println("********************************************************");
        System.out.println("********************************************************");
        System.out.println();
        System.out.println("Entrer la valeur a");
        a = scanner.nextInt();
        System.out.println("entrer l'opérateur ");
        scanner.nextLine();
        ch = scanner.nextLine();
        op = ch.charAt(0);
        System.out.println("Entrere la valeur b");
        b = scanner.nextInt();

        switch (op){
            case ('+'):
                System.out.println("la somme des valeurs est : "+(a+b));
                break;
            case ('-'):
                System.out.println("le resultat des valeurs est : "+(a-b));
                break;
            case ('*'):
                System.out.println("le produit des valeurs est : "+(a*b));
                break;
            case ('/'):
                if (b != 0){
                    System.out.println("le quotient des valeurs est : "+(a/b));
                }else
                    System.out.println("Impossible de diviser par zero");
                break;
            default:
                System.out.println("l'opérateur saisie est incorrecte");
                break;

        }

    }
}
