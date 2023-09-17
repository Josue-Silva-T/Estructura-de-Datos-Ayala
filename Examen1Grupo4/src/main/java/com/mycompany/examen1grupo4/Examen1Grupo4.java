/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1grupo4;

/**
 *
 * @author j0xs
 */
public class Examen1Grupo4 {

    public static int resultado =0;
    public static String Divisores(int numero, int contador, int contDiv){
        if(contador <= numero){
            int div = numero/contador;
            if(div*contador == numero){
                System.out.print(div + " ");
                contDiv++;
            }
            contador++;
            resultado = contDiv;
            Divisores(numero, contador ,contDiv);
        }
        return "\n"+numero+" Tiene "+resultado+" Divisores.";
    }
    
    
    public static void main(String[] args) {
        System.out.println(Divisores(100, 1, 0));
    }
}
