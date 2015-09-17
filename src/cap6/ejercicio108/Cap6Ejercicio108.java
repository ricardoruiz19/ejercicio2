
package cap6.ejercicio108;

import java.util.Scanner;



public class Cap6Ejercicio108 {

    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner Teclado = new Scanner(System.in);
       
       double estudiante, alg, mat, esp , suma = 0;
       
       System.out.println("Digite numero de Estudiantes a revisar");
       estudiante = Teclado.nextDouble();
       
       System.out.println("Digite Nota de Algoritmos");
       alg = Teclado.nextDouble();
       
       System.out.println("Digite Nota De Matematicas");
       mat = Teclado.nextDouble();
       
       System.out.println("Digite Nota De Español");
       esp = Teclado.nextDouble();
       
        for (int i = 1; i < estudiante; i++) {
            
           suma =  alg + mat + esp / 3;
           
          System.out.println("El Promedio Del Estudiante Es: " +suma);
          
           
          System.out.println("Digite Nota de Algoritmos");
        alg = Teclado.nextDouble();
       
       System.out.println("Digite Nota De Matematicas");
       mat = Teclado.nextDouble();
       
       System.out.println("Digite Nota De Español");
       esp = Teclado.nextDouble();
        }
       
        System.out.println("El Promedio Del Estudiante Es: " +suma);
 
        
    }
    
}
