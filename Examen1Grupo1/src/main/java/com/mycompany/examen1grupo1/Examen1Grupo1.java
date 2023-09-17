/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1grupo1;

/**
 *
 * @author j0xs
 */
public class Examen1Grupo1 {
    
    private static int mayor;
    private static final int []arr = {87,9,65,9,54,87};
    private static int cont = 0;
    
    public static int acomoda(int num1, int num2){
        mayor = Math.max(num1, num2);
        cont++;
        if(cont < arr.length) acomoda(mayor, arr[cont]);
        return mayor;
    }
    
    public static void main(String[] args) {
        System.out.print("Arreglo inicial: ");
        for(int i = 0; i<arr.length; i++) System.out.print(arr[i]+" ");
        System.out.println("\nEste es el numero mayor: "+ acomoda(arr[0],arr[1]));
    }
    
}
