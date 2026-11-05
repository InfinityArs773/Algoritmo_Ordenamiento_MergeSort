/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mialgoritmomergesort;

/**
 *
 * @author Erick López
 */
public class MergeSort {

    public static void ordenar(int[] arreglo, int inicio, int fin){

        if (inicio >= fin){
            return;
        }

        int medio = inicio + (fin - inicio)/2;

        ordenar(arreglo, inicio, medio);
        ordenar(arreglo, medio +1, fin);

        int[] izquierda = new int[medio - inicio +1];
        int[] derecha = new int[fin - medio];

        Mezcla.copiar (arreglo, izquierda, inicio, 0);

        Mezcla.copiar(arreglo, derecha, medio + 1, 0);

        Mezcla.combinar (izquierda, derecha, arreglo, inicio, 0, 0);
    }
}