/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class B1_EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Es el año que has indicado bisiesto?");
      double anioEJ8 = teclado.nextDouble();
      if (anioEJ8 % 400 == 0){
          System.out.println("Año bisiesto");}
      else if (anioEJ8 % 100 == 0){
          System.out.println("Año no bisiesto");}
      else if (anioEJ8 % 4 == 0){
          System.out.println("Año bisiesto");}
          
       
        
                  
      }
      
      
      
    }


