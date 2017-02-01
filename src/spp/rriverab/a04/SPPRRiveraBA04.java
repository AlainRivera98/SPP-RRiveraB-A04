//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.a04;
import java.util.Scanner;
import java.lang.Math;

public class SPPRRiveraBA04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double y;
        int a;
        
        System.out.println("Calculadora de Seno, Coseno, Tangente \n \n");
        System.out.println("Introduzca una opción deseada \n");
        System.out.println("1. Calcular Tangente");
        System.out.println("2. Calcular Seno");
        System.out.println("3. Calcular Coseno");
        System.out.println("4. Salir \n");
        a = teclado.nextInt();
        
        switch(a){
            case 1:
                y = Math.tan(ángulo ()*Math.PI/180);
                System.out.println("La tangente del ángulo es: " +y);
                
            case 2:
                y = Math.sin(ángulo ()*Math.PI/180);
                System.out.println("El seno del ángulo es: " +y);
                
            case 3:
                y = Math.cos(ángulo ()*Math.PI/180);
                System.out.println("El coseno del ángulo es: " +y);
                
            default:
                System.out.println("Adiós");
                
        }
            
    }
    
    
    static double ángulo (){
        Scanner teclado = new Scanner (System.in);
        double x;
        System.out.println("Introduzca un ángulo en grados sexagesimales (0° a 360°): \n");
        x = teclado.nextDouble();
        return x;
    }
    
           
}
