
package tp01;

import java.util.Scanner;

public class anneBissextile3 {

   
    public static void main(String[] args) {
       int annee;
       Scanner read=new Scanner(System.in);
        
       do {
       System.out.print("Entrer une année entre [1900, 2100] :  ");
       annee=read.nextInt();
        } while (annee<1900||annee>2100);
       
       
        if ((annee%400==0)||(annee%100!=0)&&(annee%4==0)){
            System.out.println("L'année est bissextile");  }
        else {
            System.out.println("L'année n'est pas bissextile");  }
    }
    
}
