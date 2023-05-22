/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.v4.trifiv;

/**
 *
 * @author bbarr
 */
public class funcionMultiplo {

public String retornaMultiplo(int numero){
    if(numero % 3 == 0 && numero % 5 == 0){
            return "TRIFIV";
        } else if (numero % 3 == 0){
            return "TRI";
        } else if (numero % 5 == 0){
            return "FIV";
        } 
        return "Ningun valor";
    }
}