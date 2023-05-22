/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.v4.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class V4TRIFIV {
public static void main(String[] args) throws IOException {
         BufferedReader bufEntrada = new BufferedReader (new InputStreamReader (System.in));
        int numero;
    // Creo objeto
        funcionMultiplo mul = new funcionMultiplo ();
    // Entrada de datos
        System.out.println("Dame el numero");
        numero = Integer.parseInt (bufEntrada.readLine());
    // Salida de datos
        System.out.println(mul.retornaMultiplo(numero));
    }
    
}
