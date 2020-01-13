
package tp02;

import java.util.Scanner;

public class nbrOccurrences {

    public static void main(String[] args) {
        final int n=10;
        int com,i,x;
        int []tab= new int[n];
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        {  
            System.out.print("Entrer la valeur "+(i+1)+" : ");
            tab[i]=read.nextInt();
        }
        System.out.println("Entrer la valeur cherché : ");
        x=read.nextInt();
        com=0;
        for(i=0;i<tab.length;i++)
        {
            if (tab[i]==x)
                com++;
        }
        System.out.println("La nombre d'Occurences est : "+com);
    }
    
}
