package com.mycompany.examen1grupo2;

public class Examen1Grupo2 {
    /**
     * Funcion que cuenta solo los caracteres sin espacio de un string con recursividad
     * @param cadena
     * @param contador
     * @param caracteres
     * @return numero de caracteres
     */
    public static int numero;
    public static int contar(String cadena, int contador, int caracteres){
        if(contador < cadena.length()-1){
            if (cadena.charAt(contador+1) != ' '){ 
                caracteres++;
                numero = caracteres;
            }
            contador++;
            contar(cadena,contador, caracteres);
        }
        return numero;  
    }
    
    public static void main(String[] args) {
        String cadena = "E s t r  u c t u r  a    d  e  d a t os";
        System.out.println("Este es el numero de caracteres: "+contar(cadena, -1,0));
    }
}
