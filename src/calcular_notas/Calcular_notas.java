
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
        int cant,x,i;
       Scanner leer = new Scanner(System.in);
       ArrayList <String> Produc;
       Produc = new ArrayList();
       ArrayList <Double> prom;
       prom = new ArrayList();
       System.out.println("Digite la cantidad de estudiantes");
       cant = leer.nextInt();
       for(x=1; x<=cant; x++){
          System.out.println("Digite nombre del estudiante"); 
          Produc.add(leer.next());
          System.out.println("digite promerio del estudiante");
          prom.add(leer.nextDouble());
       }
       for(i=0; i<Produc.size(); i++){
           System.out.println(Produc.get(i)+"\t"+", Promedio: "+prom.get(i));
           if((i)>3.0){
               System.out.println((i));
           }
       }
       
       
       
    }
    
}
