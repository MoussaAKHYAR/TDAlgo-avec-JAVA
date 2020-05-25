import java.util.Scanner;

public class Exo26 {
    public static void main(String[] args) {
        int rep , croissant, decroissant, n, t, p;
        Scanner scanner = new Scanner(System.in);
        rep = 1;
        croissant = 0;
        decroissant = 0;
        t = 1;
        p = 0;
        while (rep == 1){
            System.out.println("Entrer une valeur");
            n = scanner.nextInt();
            if (n >= p){
                p = n;
                croissant +=1;
            }else {
                p = n;
                decroissant += 1;
            }
            System.out.println("Saisi 1 si vous voulez continuer ");
            rep = scanner.nextInt();
            t++;
        }
        if (t == croissant){
            System.out.println("les valeurs saisies sont dans l'ordre croissant");
        }else if (t == decroissant){
            System.out.println("Les valeurs saisies sont dans l'ordre decroissant");
        }else
            System.out.println("les valeurs saisies sont dans l'ordre quelconque");
    }
}
