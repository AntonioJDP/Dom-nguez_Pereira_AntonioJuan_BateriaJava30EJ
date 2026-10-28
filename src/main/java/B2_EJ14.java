/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ajdominguezpereira
 */
public class B2_EJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numeroEJ14 = teclado.nextInt();
        int sumacumuladora = 0;
        for(int i = 1; i<=numeroEJ14; i++){
            sumacumuladora = sumacumuladora+i;
            if (numeroEJ14 < 0){
                System.out.println("Error");}
            else{System.out.println("Suma desglosada:"+sumacumuladora);
                
                
           
            
        }
    }
    
}
}
