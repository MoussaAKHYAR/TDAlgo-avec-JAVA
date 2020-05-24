import java.util.Scanner;

public class Exo8 {
    /*
    Exercice 8 : Ecrire un algorithme permettant de résoudre une équation du second degré.
    Ax2 + bx + c = 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,d,x1,x2;
        do {
            System.out.println("entrer les valeurs de a,b,c avec a#0");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }while (a==0);
        d = b*b-(4*a*c);
        if(d>0){
            x1 = (float) (-b-(Math.sqrt(d)))/2*a;
            x2 = (float) ((-b+(Math.sqrt(d)))/2*a);
            System.out.println("les solutions de l'equation est : X1 = "+x1+" et X2 ="+x2);
        }
        if(d==0){
        x1 = -b/2*a;
            System.out.println("la solution est : "+x1);
        }
    }
}
