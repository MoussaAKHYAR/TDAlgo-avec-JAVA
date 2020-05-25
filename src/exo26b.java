import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class exo26b {
    public static void main(String[] args) {
        int n, croissant, décroissant, rep, t, p, i, m;

        Scanner sc = new Scanner(System.in);
        rep = 1;
        t = 0;
        List<Integer> listValeur = new ArrayList<>();
        while (rep == 1) {
            System.out.println("Entrer une valeur: ");
            n = sc.nextInt();
            listValeur.add(n);
            System.out.println("taper 1 si vous voulez continuer à saisir: ");
            rep = sc.nextInt();
            t = t + 1;
        }
        for (Integer index : listValeur) {
            System.out.print(index + "\t");
        }
        boolean c = true;
        boolean d = true;
        for (i = 1; i < listValeur.size(); i++) {
            if (listValeur.get(i) > listValeur.get(i - 1)) {
                d = false;
            } else {
                c = false;
            }
            if (c == false && d == false)
                break ;
        }
        if (c == true) {
            System.out.println("Croissant");
        }
        if (d == true) {
            System.out.println("decroissant");
        }
        if (c == false && d == false) {
            System.out.println("quelconque");
        }

    }

}
