import java.util.Scanner;

public class Exo1 {
    /*
    Exercice 1 :
    Ecrire un programme qui saisit deux entiers a et b, calcule et affiche le quotient entier,
    le reste de la division et le ratio (quotient réel).
    */
    public static void main(String[] args) {
        int a,b,q,r;
        float qr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("entre les valeurs a et b");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }while (b<=0);
        q = a/b;
        r = a%b;
        qr = (float)a/b;

        System.out.println("le quotient de la division "+a+"/"+b+" est "+q);
        System.out.println("le reste de la division "+a+"/"+b+" est "+r);
        System.out.println("le quotient réel de la division "+a+"/"+b+" est "+qr);

    }
}
