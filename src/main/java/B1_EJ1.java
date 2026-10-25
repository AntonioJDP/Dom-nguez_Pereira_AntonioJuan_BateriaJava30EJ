/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ajdominguezpereira
 */import java.util.Scanner;

public class B1_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numeroEJ1 = teclado. nextInt();
        if (numeroEJ1 == 0 ){
            System.out.println("El número es igual a cero");
        }else if (numeroEJ1 > 0){
            System.out.println("El número es positivo");            
        }else {
             System.out.println("El número es negativo");
                }
        
        
        
        
       
     
    }
    
}
