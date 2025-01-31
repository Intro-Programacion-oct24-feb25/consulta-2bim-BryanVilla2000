/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del que desea el factorial");
        int numero = entrada.nextInt();
        
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }
    
    public static int factorial(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
}
