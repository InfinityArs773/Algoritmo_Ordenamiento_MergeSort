/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mialgoritmomergesort;

/**
 *
 * @author Erick López
 */
public class Imprimir {

    public static void imprimir(int[] arreglo, int i) {

        if (i == arreglo.length) {
            return;
        }

        System.out.print(arreglo[i] + " ");

        imprimir(arreglo, i + 1);
    }
}

