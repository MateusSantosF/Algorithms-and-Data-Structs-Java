/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author mateu
 */
public abstract class SortingUtils {
    
    public static void swap(Object[] array, int a, int b){
        
        Object aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }
}
