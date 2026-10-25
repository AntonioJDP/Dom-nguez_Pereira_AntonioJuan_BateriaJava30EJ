/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ajdominguezpereira
 */import java.util.Scanner;
public class B1_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numeroEJ2 = teclado.nextInt();
        if (numeroEJ2 % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
    
}
