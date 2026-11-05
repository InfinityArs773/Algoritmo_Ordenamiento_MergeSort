/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mialgoritmomergesort;

/**
 *
 * @author Erick López
 */
public class Mezcla {
    
    public static void copiar(int[] origen, int[] destino, int i, int j) {

        if (j == destino.length) {
            return;
        }

        destino[j] = origen[i];

        copiar(origen, destino, i + 1, j + 1);
    }

    public static void combinar(int[] izquierda, int[] derecha, int[] arreglo, int indice, int i, int j) {

        if (i == izquierda.length) {
            copiarRestantes(derecha, arreglo, j, indice);
            return;
        }

        if (j == derecha.length) {
            copiarRestantes(izquierda, arreglo, i, indice);
            return;
        }

        if (izquierda[i] <= derecha[j]) {

            arreglo[indice] = izquierda[i];

            combinar(izquierda, derecha, arreglo,
                     indice + 1, i + 1, j);

        } 
        
        else {
            arreglo[indice] = derecha[j];

            combinar(izquierda, derecha, arreglo,
                     indice + 1, i, j + 1);
        }
    }

    public static void copiarRestantes(int[] origen, int[] destino, int i, int j) {

        if (i == origen.length) {
            return;
        }

        destino[j] = origen[i];

        copiarRestantes(origen, destino, i + 1, j + 1);
    }
}
