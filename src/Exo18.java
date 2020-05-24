import java.util.Scanner;

public class Exo18 {
    /*
    Exercice 18: Faire un programme qui calcule et affiche le PPCM de deux entiers saisis au clavier.
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int a,b,c,d,e,resu,pgcd,ppcm;

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
        ppcm = (e*d)/pgcd;
        System.out.println("le PGCD de "+e+" et "+d+" est : "+pgcd);
        System.out.println("le PPCM de "+e+" et "+d+" est : "+ppcm);

    }
}
