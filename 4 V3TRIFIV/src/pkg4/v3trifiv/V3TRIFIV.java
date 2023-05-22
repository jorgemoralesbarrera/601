/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bbarr
 */
public class V3TRIFIV {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
        // TODO code application logic here
public static void main(String[] args) throws IOException {
     
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numero;    
        
        
    //ENTRADA DE DATOS
       
       System.out.println ("Dame el numero:");
       numero=Integer.parseInt(bufEntrada.readLine());
       
       //SALIDA DE DATOS
       
       System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo (int num){
        
        int mult3;
        int mult5;
        
        
        //PROCESAR DATOS
        mult3 = num%3;
        mult5 = num%5;
        
        //SALIDA DE DATOS
        if (mult3 == 0 && mult5 == 0){
           return "TRIFIV";
        } else if (mult3 == 0){
            return "TRI"; 
        } else if (mult5 == 0){
            return "FIV";
        }
      
        return "NINGUN VALOR";
    }
    
}