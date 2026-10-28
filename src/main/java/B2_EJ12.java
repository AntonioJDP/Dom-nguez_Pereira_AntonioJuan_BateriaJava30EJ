/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
   
public class B2_EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
     System.out.println("¿Cúal es el primer número?");
    int numeroInicioEJ12 = teclado.nextInt();
    System.out.println("¿Cuál es el segundo número?");   
    int numeroFinalEJ12 = teclado.nextInt();   
    if (numeroInicioEJ12 <= numeroFinalEJ12){
    for(int i = numeroInicioEJ12 ; i <= numeroFinalEJ12; i++){
        if (i % 2 ==0)
        System.out.println("Números pares:"+i);}
                }else{
        for(int i =  numeroInicioEJ12; i>= numeroFinalEJ12; i--){
            if (i % 2 ==0){
            System.out.println("Números pares:"+i);}
            
    }
    }
            
            
        }
}
    
   
    
    
    
     
    

