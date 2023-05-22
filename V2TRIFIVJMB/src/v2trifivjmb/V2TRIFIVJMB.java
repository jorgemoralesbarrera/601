/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v2trifivjmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bbarr
 */
public class V2TRIFIVJMB {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */

        // TODO code application logic here
 public static void main(String[] args) throws IOException {
        
    // DECLARACION DE VARIABLES
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numero;
        int mult3;
        int mult5;
        
        
    //ENTRADA DE DATOS
        
        
       System.out.println ("Dame el numero:");
       numero=Integer.parseInt(bufEntrada.readLine());
       
    //PROCESAR DATOS
    
        mult3 = numero%3;
        mult5 = numero%5;
        
    //SALIDA DE DATOS
    
        if (mult3 == 0 && mult5 == 0){
            System.out.println ("TRIFIV");
        } else if (mult3 == 0){
            System.out.println ("TRI"); 
        } else if (mult5 == 0){
            System.out.println ("FIV");
        }
      
        
    }
}