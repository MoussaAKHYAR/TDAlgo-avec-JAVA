import java.util.Scanner;

public class Exo25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,i,j,cpt;
        for (i=1;i<=10;i++){
            System.out.println(" ");
            for (j=1;j<=i;j++){
                System.out.print(i);
            }
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------");
        System.out.println("entrer un nombre");
        n = scanner.nextInt();
        cpt = 0;
        for (i=1;i<=n;i++){
            if(n%i == 0)
                cpt = cpt + 1;
        }
        if (cpt == 2)
            System.out.println("le nombre "+n+" est premier");
        else System.out.println("le nombre "+ n+" n'est pas premier");
    }
}