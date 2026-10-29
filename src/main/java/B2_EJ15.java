/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ajdominguezpereira
 */
public class B2_EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 20");
        int numeroentero = teclado.nextInt();
        long factorial = 1;
        if (numeroentero <0 || numeroentero>20){
            System.out.println("Error");
         } else {
            
            while(numeroentero > 0){
                factorial*=numeroentero--;}
            System.out.println(factorial);
          
            
                    
            
       
        }
    }
    }

