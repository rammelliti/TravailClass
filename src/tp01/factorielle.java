
package tp01;

import java.util.Scanner;

public class factorielle {

   
    public static void main(String[] args) {
 
        Scanner read=new Scanner(System.in);
        int i=1,nbr;
        long prod=1; 
        System.out.print("Entrer votre nombre : ");
        nbr= read.nextInt();
        
        // for(int i=2;i<=nbr;i++){ 
            do{
           prod *=i;
            i++;
        } while(i<=nbr);
       System.out.println("le produit des " + nbr+" vaut : "+prod);
     
    }
    
}
        
 