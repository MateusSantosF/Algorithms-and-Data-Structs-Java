/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;


import javax.swing.SortOrder;
import utils.SortingUtils;

/**
 *
 * @author Mateus Santos Ferreira | GitHub: MateusSantosF
 */
public abstract class SelectionSort {
    
    
    public static <Type extends Comparable<Type>> void sort(Type[] array){
        
        int size = array.length;     
        for( int indexOrdered = 0; indexOrdered < size ; indexOrdered++ ){
            
            int currentMinIndex = indexOrdered;
            for(int indexDesordered = indexOrdered + 1; indexDesordered < size; indexDesordered++){
                if(array[indexDesordered].compareTo(array[currentMinIndex]) < 0){
                  
                    currentMinIndex = indexDesordered;
                    
                }
            }
            SortingUtils.swap(array, indexOrdered, currentMinIndex);
        }
    }
    
    public static <Type extends Comparable<Type>> void sort(Type[] array, SortOrder sortOrder){
        
        int size = array.length;  
        
        
        if (sortOrder == SortOrder.ASCENDING) {
            for (int indexOrdered = 0; indexOrdered < size; indexOrdered++) {

                int currentMinIndex = indexOrdered;
                for (int indexDesordered = indexOrdered + 1; indexDesordered < size; indexDesordered++) {
                    if (array[indexDesordered].compareTo(array[currentMinIndex]) < 0) {

                        currentMinIndex = indexDesordered;

                    }
                }
                SortingUtils.swap(array, indexOrdered, currentMinIndex);
            }
        }else{
             for (int indexOrdered = 0; indexOrdered < size; indexOrdered++) {

                int currentMinIndex = indexOrdered;
                for (int indexDesordered = indexOrdered + 1; indexDesordered < size; indexDesordered++) {
                    if (array[indexDesordered].compareTo(array[currentMinIndex]) > 0) {

                        currentMinIndex = indexDesordered;

                    }
                }
                SortingUtils.swap(array, indexOrdered, currentMinIndex);
            }
            
        }
        
    }
}
