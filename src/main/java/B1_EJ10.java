
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ajdominguezpereira
 */


public class B1_EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige 1 para Celsius a Fahrenheit,"
                + " 2 para Fahrenheit a Celsius,"
                + " 3 para Salir");
        int OpcionEJ10 = teclado.nextInt();
    
        switch(OpcionEJ10){
            case 1:
                System.out.println("1. Celsius a Fahrenheit");
                double conversionaFahrenheit = teclado.nextDouble();
                System.out.println( conversionaFahrenheit * 9 / 5 + 32);
                break;
            case 2:
                System.out.println("2. Fahrenheit a Celsius");
                double conversionaCelsius = teclado.nextDouble();
                System.out.println((conversionaCelsius - 32) * 5/9);
                break;
            case 3:
                System.out.println("3. Salir");
                System.out.println("Salir");
                break;
            default:
                System.out.println("Error");
            
        }
        
    }
    
}
