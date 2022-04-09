package estruturadedados;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.SelectionSort;
import javax.swing.SortOrder;



public class Estruturadedados {

    public static void main(String[] args) {
       
        
        /**
         * Mateus Santos Ferreira
         * 
         * OBS: Verifique o Pacote de Testes
         */
        
       
        Integer[] array = {1,5,6,1,24,31,11,9,2};
        System.out.println("Selection===");
        SelectionSort.sort(array, SortOrder.DESCENDING);
        for(Integer i : array){
            System.out.print(i + " ");
        }
        System.out.println("\nBubble===");
        BubbleSort.sort(array, SortOrder.DESCENDING);
        for(Integer i : array){
            System.out.print(i + " ");
        }
        System.out.println("\nInsertion ====");
        InsertionSort.sort(array, SortOrder.DESCENDING);
        
        for(Integer i : array){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    
    }
}
