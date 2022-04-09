/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

import enums.SortOrdering;
import utils.SortingUtils;

/**
 *
 * @author mateu
 */
public abstract class InsertionSort {
 
    
    public static <Type extends Comparable<Type>> void sort(Type[] array){
        
        int size = array.length ;
        
       
        for( int indexOrdered = 1; indexOrdered < size; indexOrdered++){
            
            int orderedPart = indexOrdered;
            
            for(; orderedPart > 0 && array[orderedPart - 1].compareTo(array[orderedPart]) > 0; orderedPart--){
                SortingUtils.swap(array, orderedPart - 1,orderedPart);
            }
        }
    }
    
     public static <Type extends Comparable<Type>> void sort(Type[] array, SortOrdering sortOrder){
        
        int size = array.length ;
        
       
         if (sortOrder == SortOrdering.ASCEDING) {
             for (int indexOrdered = 1; indexOrdered < size; indexOrdered++) {

                 int orderedPart = indexOrdered;

                 for (; orderedPart > 0 && array[orderedPart - 1].compareTo(array[orderedPart]) > 0; orderedPart--) {
                     SortingUtils.swap(array, orderedPart - 1, orderedPart);
                 }
             }
         }else{
             for (int indexOrdered = 1; indexOrdered < size; indexOrdered++) {

                 int orderedPart = indexOrdered;

                 for (; orderedPart > 0 && array[orderedPart - 1].compareTo(array[orderedPart]) < 0; orderedPart--) {
                     SortingUtils.swap(array, orderedPart - 1, orderedPart);
                 }
             }
         }
       
        
    }
}
