/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        double base, altu, per, sup;
        System.out.println("Introduce la base del rectángulo:");
        base= teclado.nextDouble();
        System.out.println("Introduce la altura del rectángulo:");
        altu= teclado.nextDouble();
        
        per= (base*2)+(altu*2);
        sup= base*altu;
        
        System.out.println("El perimetro es= "+per);
        System.out.println("El area es= "+sup);
        // TODO code application logic here
    }
    
}
