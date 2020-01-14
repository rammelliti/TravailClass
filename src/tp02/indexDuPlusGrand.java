
package tp02;

import java.util.Scanner;

public class indexDuPlusGrand {

    public static void main(String[] args) {
        final int n=4;
        int i,index;
        int [] tab= new int[n];
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        {
            System.out.print("Entrer la valeur "+i+" : ");
            tab[i]=read.nextInt();
        }
        index=0;
        for (i=0;i<tab.length;i++)
        {
                if(tab[i]>tab[index]){
                index=i;
            }   
        }
        
        System.out.println("La valeur la plus grande est : "+index);
    }
    }
    
}
