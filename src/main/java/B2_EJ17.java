/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class B2_EJ17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorEJ17 = 0;
        int sumaEJ17 = 0;
        System.out.println("Introduzca un número: ");
        int numeroEJ17 = teclado.nextInt();
        while (numeroEJ17 > 0) {
            sumaEJ17 += numeroEJ17;
            contadorEJ17++;

            System.out.println("Introduzca otro número:");
            numeroEJ17 = teclado.nextInt();
        }

        System.out.println("Números introducidos: " + contadorEJ17);
        System.out.println("Suma total: " + sumaEJ17);
        if (contadorEJ17 > 0) {
            double mediaEJ17 =sumaEJ17 / contadorEJ17;
            System.out.println("Media:" + mediaEJ17);
        } else {
            System.out.println("Error");

        }
    }

}
