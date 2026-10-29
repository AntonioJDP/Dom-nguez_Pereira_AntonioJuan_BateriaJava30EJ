/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class B2_EJ19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int numerosecreto =67;
        int contarintentos = 0;
        int intento;
      
    do{
        System.out.println("¿Cuál es el número secreto?");
    intento = teclado.nextInt();
    contarintentos++;
    if(intento<numerosecreto){
        System.out.println("El número secreto es mayor");
    } else if(intento>numerosecreto){
                System.out.println("El número secreto es menor");
    }
                
    }while(intento != numerosecreto);{
        System.out.println("Acertaste");
        System.out.println("Número de intentos:"+contarintentos);
    } 
    }

    }
    