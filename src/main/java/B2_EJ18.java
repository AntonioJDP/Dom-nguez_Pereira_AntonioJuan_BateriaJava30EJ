/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class B2_EJ18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   String contrasena = "DAW2026";
   String password;
   do {
       System.out.println("Introduzca la contraseña correcta:");
       password = teclado.next();
       if (contrasena != password)
           System.out.println("Contraseña equivocada");
   }while(!contrasena.equals(password));
   System.out.println("Acceso concedido");
        
   } 
        
    }
   
    

