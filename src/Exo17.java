import java.util.Scanner;

public class Exo17 {
    /*
    Exercice 17: Faire un programme qui calcule le PGCD de deux nombres saisis au clavier en utilisant l'astuce suivante:
     soustrait le plus petit des deux entiers du plus grand jusqu'à ce qu'ils soient égaux.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d,e,resu,pgcd;

        do {
            System.out.println("saisir les valeurs de a et b");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }while (a <= 0 || b <= 0);
        e = a;
        d = b;
        pgcd = 0;
        resu = 0;
        while (a != b){
            if (b > a){
                c = a;
                a = b;
                b = c;
            }
            resu = a - b;
            a = b;
            b = resu;
            pgcd = a;

        }
        System.out.println("le PGCD de "+e+" et "+d+" est : "+pgcd);
    }
}
