
package tp01;

import java.util.Scanner;


public class moyenne4 {

    
    public static void main(String[] args) {
        
        Scanner read= new Scanner(System.in);
        int som=0;
        
        for(int i=1;i<=4;i++){
            System.out.print("Entrer un nombre entier : ");
            som=som+read.nextInt();
        }
        System.out.println("la moyenne est : "+som/4.0);
    }
    
}
