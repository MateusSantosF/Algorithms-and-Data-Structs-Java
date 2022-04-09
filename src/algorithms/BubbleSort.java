/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

import interfaces.Iteration;
import utils.SortingUtils;

/**
 *
 * @author Mateus
 */
public abstract class BubbleSort  {
    
     
    public static <Type extends Comparable<Type>> void sort(Type[] array){
        
        boolean swaped;
        int size = array.length - 1;
        int indexOrdered = 0 ;
           
        do {
            swaped = false;
            for ( int indexDesordered = 0 ; indexDesordered  < (size - indexOrdered); indexDesordered++) {
                if( array[indexDesordered].compareTo(array[indexDesordered + 1]) > 0){
                    SortingUtils.swap(array, indexDesordered, indexDesordered + 1);
                    swaped = true;
                }
            }
            
            indexOrdered++;
        } while (indexOrdered < size && swaped);
        
    
    }


    
}
