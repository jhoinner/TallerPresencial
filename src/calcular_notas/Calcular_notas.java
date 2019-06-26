
package calcular_notas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jhoinner Constante.
 */
public class Calcular_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant,x,i,f;
        double prom;
       Scanner leer = new Scanner(System.in);
       ArrayList <String> Produc;
       Produc = new ArrayList();
       System.out.println("Digite la cantidad de estudiantes");
       cant = leer.nextInt();
       for(x=1; x<=cant; x++){
          System.out.println("Digite nombre del estudiante"); 
          Produc.add(leer.next());
       }
       for(f=1; f<=cant; f++){
          System.out.println("digite promerio del estudiante");
          
       }
       for(i=0; i<Produc.size(); i++){
           System.out.println(Produc.get(i));
           
       }
       
       
       
       
    }
    
}
