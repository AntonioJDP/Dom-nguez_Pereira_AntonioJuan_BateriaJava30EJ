/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ajdominguezpereira
 */

import java.util.Scanner;
public class B1_EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
        System.out.println("Pon el primer número");
        double numero1EJ9 = teclado.nextDouble();
        System.out.println("Pon el segundo número");
        double numero2EJ9 = teclado.nextDouble();
        System.out.println("Pon la operación matemática");
        String operacionEJ9 = teclado.next();
        switch (operacionEJ9){
        case "+":
        case "suma":
            System.out.println(numero1EJ9 + numero2EJ9);
            break;
        case "-":
        case "resta":
            System.out.println(numero1EJ9 - numero2EJ9);
            break;
        case "*":
        case "x":
        case "multiplicacion":
        case "multiplicación":
            System.out.println(numero1EJ9 * numero2EJ9);
            break;
        case "/":
        case "division":
        case "división":
            if (numero2EJ9 == 0){
            System.out.println("Error división entre cero");}
            else{
            System.out.println(numero1EJ9 / numero2EJ9);}
            break;
        default:
            System.out.println("Operación fallida");
            break;
            
            
        
            
            
            
        
        
        
        
    }
        
        
        
    }
    
}
