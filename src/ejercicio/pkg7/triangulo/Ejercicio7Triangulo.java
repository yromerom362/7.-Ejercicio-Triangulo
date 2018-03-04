/*
 * EJERCICIO 7 Triangulo
 * YEISSON ROMERO
 * UNIVERSIDAD EAN
 * CONSTRUCCION DE SOFTWARE GUIA 2
 */
package ejercicio.pkg7.triangulo;

/**
 *Ejerciccio 7
 * @author YROMERO
 */
import java.util.Scanner;

public class Ejercicio7Triangulo {

//Proceso Inicial 
    
        static double Semiperimetro(double Lado1, double Lado2, double Lado3){
     
//Calculo de variable 

        double S=0;
        S=(Lado1+Lado2+Lado3)/2;
                    
        return S;
        
        }
        
        static double Area (double Lado1, double Lado2, double Lado3, double smp ){
     
        double A=0;
        A=Math.sqrt(smp*(smp-Lado1)*(smp-Lado2)*(smp-Lado3));
                    
        return A;
        
        }
        
        static double circumradius(double Lado1, double Lado2, double Lado3, double smp){
     
        double circ=0;
        circ=(Lado1*Lado2*Lado3)/(4*Math.PI*Math.sqrt(smp*(smp-Lado1)*(smp-Lado2)*(smp-Lado3)));
                    
        return circ;
        
        }
       
    public static void main(String[] args) {
        
        
       double a;
       double b;
       double c;
   
//Proceso Final
   
   
       Scanner Teclado= new Scanner (System.in);
 
       //Entrada Inicial
   
       System.out.println("Introduzca el lado a: ");
       a = Teclado.nextFloat();
       System.out.println("Introduzca el lado b: ");
       b = Teclado.nextFloat();
       System.out.println("Introduzca el lado c: ");
       c = Teclado.nextFloat();
      
       //Entrada Final
       
   //Salida Inicial
   
       double sm=Semiperimetro(a,b,c);  
       System.out.println("Semiperimetro: " +sm);
       double Ar=Area(a,b,c,sm);
       System.out.println("Area: " +Ar);
       double CircR=circumradius(a,b,c,sm);
       System.out.println("Circumradius: " +CircR);
    
    //Salida Final 
    }    
    
}