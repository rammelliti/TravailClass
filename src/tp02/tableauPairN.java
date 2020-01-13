
package tp02;

import java.util.Scanner;

public class tableauPairN {

    public static void main(String[] args) {
        final int n=4;
        int i;
        int []tab= new int[n];
        boolean estPair;
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        {  
            System.out.print("Entrer la valeur "+(i+1)+" : ");
            tab[i]=read.nextInt();
        }
        estPair= true;i=0;
        while ((estPair)&&(i<n))
        {
            if (tab[i]%2==1){
                estPair=false;
            }
            i++;
        }
        System.out.println("Tous les éléments sont pairs : "+estPair);
    }
    
}
