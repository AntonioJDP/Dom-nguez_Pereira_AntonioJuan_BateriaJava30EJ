
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class B1_EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double importeEJ7 = teclado.nextDouble();
        double descuentoEJ7 = 0;
        if (importeEJ7 < 0) {
            System.out.println("Error");
        } else if (importeEJ7 < 50) {
            descuentoEJ7 = 0;
        } else if (importeEJ7 < 100) {
            descuentoEJ7 = 5;
        } else if (importeEJ7 < 200) {
            descuentoEJ7 = 10;
        } else{
            descuentoEJ7 = 15;}
        double descuentoformula = importeEJ7 * (descuentoEJ7/100);
        double preciofinalEJ7 = importeEJ7 - descuentoformula;
        System.out.println("Importe inicial: " + importeEJ7 + "€");
        System.out.println("Descuento ("+ descuentoEJ7+"%):" +descuentoformula + "€");
        System.out.println("Precio final: " + preciofinalEJ7 + "€");
        
        }

    }

    



