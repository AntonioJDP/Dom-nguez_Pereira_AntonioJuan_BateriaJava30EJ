/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ajdominguezpereira
 */
import java.util.Scanner;

public class B2_EJ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Tablas de multiplicar:");
        System.out.println("Dame un número");
        int numeroenteroEJ13 = teclado.nextInt();
        for (int i = 1; i<= 10; i++){
            System.out.println(numeroenteroEJ13 + "x" + i + "=" + (numeroenteroEJ13 * i));
            
        }
              
        
    }
    
}
