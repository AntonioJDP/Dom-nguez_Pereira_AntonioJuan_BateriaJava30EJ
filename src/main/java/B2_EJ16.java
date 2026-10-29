/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ajdominguezpereira
 */
public class B2_EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuenta atrás: ");
        int cuentatras = teclado.nextInt();
         if (cuentatras <0){
             System.out.println("Error");
         }else{
             while(cuentatras>0){
                 System.out.println(cuentatras--);
             }
         }
    }
    
}
