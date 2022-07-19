/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String Nombre = "Adriel";
        short edad = 21;
        System.out.println(Nombre + ": " + edad);
        Nombre = Leer.nextLine();
        System.out.println(Nombre);
    }
    
}
