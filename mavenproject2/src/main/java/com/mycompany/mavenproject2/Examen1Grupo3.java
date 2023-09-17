/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author j0xs
 */
public class Examen1Grupo3 {

    public static int Comprobador(int numero){
        if(numero != 0){
            int res = numero%10;
            if(res%2 != 0){
                numero = 0;
                return 0;
            }
            numero = numero/10;
            Comprobador(numero);
        }
        return 1;
    }
    public static void main(String[] args) {
        int numero = 2664;
        System.out.println(Comprobador(numero));
    }
}
