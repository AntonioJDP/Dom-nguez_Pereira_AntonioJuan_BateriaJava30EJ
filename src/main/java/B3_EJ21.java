/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class B3_EJ21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerospositivos = 0;
        int numerosnegativos = 0;
        int cantidad0 = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.println("Dame el número "+ i+" de 10");
            int numerospedidos = teclado.nextInt();
            if (numerospedidos > 0){
                 numerospositivos++;
            }else if (numerospedidos<0){
                numerosnegativos++;
            }else{
            cantidad0++;
            
        }
    }
        System.out.println("Cantidad de numeros positivos:"+numerospositivos);
        System.out.println("Cantidad de numeros negativos:"+numerosnegativos);
        System.out.println("Cantidad de ceros:" +cantidad0);
}

}
