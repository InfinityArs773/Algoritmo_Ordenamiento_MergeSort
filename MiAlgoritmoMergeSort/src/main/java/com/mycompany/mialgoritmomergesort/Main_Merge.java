/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mialgoritmomergesort;

/**
 *
 * @author Erick López
 */
public class Main_Merge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arreglo = {67, 27, 5, 4, 99, 6, 1, 45, 2, 7, 7, 9, 9, 8};

        System.out.println("Arreglo original:");
        Imprimir.imprimir(arreglo, 0);

        MergeSort.ordenar(arreglo, 0, arreglo.length - 1);
        
        System.out.println("");
        
        System.out.println("\nArreglo ordenado:");
        Imprimir.imprimir(arreglo, 0);
    }          
}
