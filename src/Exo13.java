import java.util.Scanner;

public class Exo13 {
    /*
    Exercice 13 : Faire un programme qui saisit une date (jour, mois et année) at qui indique si la date est valide
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j,m,a;
        do {
            System.out.println("entrer le jour/mois/année");
            j = scanner.nextInt();
            m = scanner.nextInt();
            a = scanner.nextInt();
        }while ((j <= 0 || j >31)||(m<=0 || m >12)||(a<1599 || a > 2199));
        if ( m == 2 && j >29){
            System.out.println("la date "+j+" / "+m+" / "+a+" est invalide");
        }else if ((m == 4 || m == 6 || m == 9 || m == 11) && j>30){
            System.out.println("la date "+j+" / "+m+" / "+a+" est invalide");
        }
        else {
            System.out.println("la date "+j+" / "+m+" / "+a+" est valide");
        }
    }
}
