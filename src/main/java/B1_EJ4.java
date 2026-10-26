/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ajdominguezpereira
 */import java.util.Scanner;
public class B1_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int numero1EJ4 = teclado.nextInt();
    int numero2EJ4 = teclado.nextInt();
    int numero3EJ4 = teclado.nextInt();    
    if (numero1EJ4 >= numero2EJ4 && numero1EJ4 >= numero3EJ4){
       System.out.println("El mayor es: "+numero1EJ4);}
    }
    
}
