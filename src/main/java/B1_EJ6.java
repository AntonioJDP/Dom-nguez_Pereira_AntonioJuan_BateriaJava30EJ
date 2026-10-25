/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */import java.util.Scanner;
 
public class B1_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es la altura del usuario?");
        int alturaEJ6 = teclado.nextInt();
        if (alturaEJ6 <0){
            System.out.println("Error");}
        else if ( alturaEJ6<140){
            System.out.println("Acceso denegado");}
        else{
            System.out.println("Acceso permitido");
        }
        
        
    }
    
}
