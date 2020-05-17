import java.util.Scanner;

public class Exo3 {
    /*
    Exercice 3 :
    Version 1 :
    Faire un programme qui saisit 3 résistances : R1, R2 et R3.
    Calculer et afficher la résistance en série : R1 + R2 +R3
    Calculer et afficher la résistance en parallèle : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)
    Version 2 :
    Demander a l’utilisateur d’indiquer son choix.
    S’il entre la valeur  1, calculer et afficher la fréquence en série.
    S’il entre la valeur 2, calculer et afficher la fréquence en parallèle.
     */
    public static void main(String[] args) {
        //Version 1
        float r1,r2,r3,rs,rp;
        int rep;
        Scanner scanner = new Scanner(System.in);
        /*do {
            System.out.println("Entrer les résistences R1 R2 R3 ");
            r1 = scanner.nextFloat();
            r2 = scanner.nextFloat();
            r3 = scanner.nextFloat();
        }while (r3==0);
        rs = (r1+r2+r3);
        rp = (r1*r2*r3)/(r1*r2 + r2*r3 + r1*r3);
        System.out.println("Résistence en série "+rs);
        System.out.println("Résistence en paralléle "+rp);
        */
        //Version 2
        do {
            System.out.println("Entrer les résistences R1 R2 R3 ");
            r1 = scanner.nextFloat();
            r2 = scanner.nextFloat();
            r3 = scanner.nextFloat();
        }while (r3==0);
        System.out.println("tapez 1 si vous voulez calculer la résistence en série");
        System.out.println("tapez 2 si vous voulez calculer la résistence en paralléle");
        rep = scanner.nextInt();
        switch (rep){
            case 1 :
                rs = (r1+r2+r3);
                System.out.println("Résistence en série "+rs);
                break;
            case 2 :
                rp = (r1*r2*r3)/(r1*r2 + r2*r3 + r1*r3);
                System.out.println("Résistence en paralléle "+rp);
                break;
            default:
                System.out.println("veuillez saisir la bonne reponse");
                break;
        }

    }

}
