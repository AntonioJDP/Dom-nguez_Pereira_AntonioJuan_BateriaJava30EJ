/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ajdominguezpereira
 */import java.util.Scanner;
 
public class B1_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
       System.out.println("Solicita dos números");
        int numero1EJ3 = teclado.nextInt();
        int numero2EJ3 = teclado.nextInt();
        if (numero1EJ3 > numero2EJ3){
                System.out.println("Numero 1 es mayor que Numero 2");
        }else if (numero1EJ3 < numero2EJ3){
            System.out.println("Numero 1 es menor que Numero 2");
                        }else{
            System.out.println("Numero 1 es igual que Numero 2");
    }
    
}
}
