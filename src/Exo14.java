import java.util.Scanner;

public class Exo14 {
    /*
    Exercice 14 : Faire un programme qui saisit une date (jour, mois et année) at qui indique si l’année est bissextile
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j,m,a;
        do {
            System.out.println("entrer le jour/mois/année");
            j = scanner.nextInt();
            m = scanner.nextInt();
            a = scanner.nextInt();
        }while ((j <= 0 || j >31)||(m<=0 || m >12)||(a<1099 || a > 2199));
        if ((a%4 == 0 && a%100 != 0) || a % 400 == 0){
            System.out.println("l'année "+a+" bissextile");
        }else
            System.out.println("l'année "+a+" n'est pas bissextile");
    }
}
