import java.util.Scanner;

public class Exo20 {
    /*
    Exercice 20 : Ecrire un algorithme qui demande successivement 10 nombres à l'utilisateur,
    et qui affiche à la fin le plus grand de ces 10 nombres Et affiche aussi son rang dans la liste saisie
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pos,max,i,j,n;
        pos = 0;
        max = 0;

        for (i = 1; i <= 10; i++){
            System.out.println("entrer une valeur ");
            n = scanner.nextInt();
            if (i == 1 || n > max ){
                max = n;
                pos = i;
            }
        }
        System.out.println("la plus grande valeur est : "+max+" est se situe à la position "+pos);
    }
}
