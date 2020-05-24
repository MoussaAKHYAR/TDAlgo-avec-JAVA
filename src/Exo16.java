import java.util.Scanner;

public class Exo16 {
    /*
    Exercice 16 : Faire un programme qui calcule et affiche la division de a par b par soustractions successives
     */

    public static void main(String[] args) {
        int a ,b ,q,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer la valeur a ");
        a = scanner.nextInt();
        System.out.println("entrer la valeur de b");
        b = scanner.nextInt();
        q = 0;
        i = a;
        while (i >= b){
            q = q + 1;
            i = i - b;
        }
        System.out.println(a+" divisé par "+b+" par soustraction successive est : "+q+" et le reste est : "+i);
    }
}
