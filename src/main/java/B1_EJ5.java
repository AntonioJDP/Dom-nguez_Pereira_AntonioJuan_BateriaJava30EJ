/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class B1_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Solicita una nota entre 0 y 10");
        double numeroEJ5 = teclado.nextDouble();
        if (numeroEJ5 < 0){
            System.out.println("Error");}
        else if (numeroEJ5 < 5) {
            System.out.println("Suspenso");
        } else if (numeroEJ5 >= 5 && numeroEJ5 < 6) {
            System.out.println("Aprobado");
        } else if (numeroEJ5 >= 6 && numeroEJ5 < 7) {
            System.out.println("Bien");
        } else if (numeroEJ5 >= 7 && numeroEJ5 < 9) {
            System.out.println("Notable");
        } else if (numeroEJ5 >= 9 && numeroEJ5 <= 10) {
            System.out.println("Sobresaliente");
        } else if (numeroEJ5 >10){
        System.out.println("Error");
        
    }

    }
}


