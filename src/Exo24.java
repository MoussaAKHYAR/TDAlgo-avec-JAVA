import java.util.Scanner;

public class Exo24 {
    /*

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b,t;
        System.out.println("Entrer la valeur du premier utilisateur ");
        a = scanner.nextInt();

        System.out.println("Deviner la valeur du premier utilisateur ");
        b = scanner.nextInt();
        t = 1;
        while (a != b) {
            t += 1;
          if (a > b) {
                System.out.println("la valeur saisie est plus petite");
          } else
                System.out.println("la valeur saisie est plus grande");
          System.out.println("Deviner la valeur du premier utilisateur pour la "+t+" émé tantative");
          b = scanner.nextInt();

        }
        System.out.println("Bravo vous avez trouvé !!!!!!!");
    }
}
