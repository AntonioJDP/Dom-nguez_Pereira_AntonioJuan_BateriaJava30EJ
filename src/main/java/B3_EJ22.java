/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class B3_EJ22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
    int Eleccion1EJ22;
    
    
    
     do{   
     System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        Eleccion1EJ22= teclado.nextInt();
        
         switch(Eleccion1EJ22){
            case 1:
                System.out.println("Introduzca el primer numero para la suma:");
               double Numero1 = teclado.nextDouble();
                System.out.println("Introduzca el segundo número para la suma:");
               double Numero2 = teclado.nextDouble();
                System.out.println("Resultado: "+(Numero1 + Numero2));
                break;
             case 2:
                System.out.println("Introduzca el primer numero para la resta:");
                Numero1 = teclado.nextDouble();
                System.out.println("Introduzca el segundo número para la resta:");
               Numero2 = teclado.nextDouble();
                System.out.println("Resultado: "+(Numero1 - Numero2));
                break;
              case 3:
                System.out.println("Introduzca el primer numero para la multiplicacíón:");
               Numero1 = teclado.nextDouble();
                System.out.println("Introduzca el segundo número para la multiplicación:");
                Numero2 = teclado.nextDouble();
                System.out.println("Resultado: "+(Numero1 * Numero2));
                break;
              case 4:
                System.out.println("Introduzca el primer numero para la división:");
               Numero1 = teclado.nextDouble();
                System.out.println("Introduzca el segundo número para la división:");
               Numero2 = teclado.nextDouble();
               if(Numero2 != 0)
                System.out.println("Resultado: "+(Numero1  / Numero2));
               else{
                   System.out.println("Error");
               }
                break;
              case 5:
                  System.out.println("Saliendo...");
              default:
                  System.out.println("Error, pruebe de nuevo");
                  break;
                  
                
                  
               
                
         }
               
     }while(Eleccion1EJ22!=5);
     
        System.out.println("No se puede seleccionar ese número");
     
     }
     

     }
    

     
    

