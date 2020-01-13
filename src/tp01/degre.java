
package tp01;

import java.util.Scanner;

public class degre {
    public static void main(String[]args)
    {
    double radiant, resultat;
    Scanner read= new Scanner(System.in);
    
    System.out.print("Entrer la valeur de l'angle en radiant : ");
    radiant = read.nextDouble();
    resultat=(radiant*180)/Math.PI;
    System.out.println("La valeur de l'angle en dégré est : "+resultat);
    }
    
    
    
}
