package estruturadedados;

import algorithms.BubbleSort;
import implementations.DoubleLinkedList;


public class Estruturadedados {

    public static void main(String[] args) {
       
        
        /**
         * Mateus Santos Ferreira
         * 
         * OBS: Verifique o Pacote de Testes
         */
        
       
        Integer[] array = {1,5,6,1,24,31,11,9,2};
        
        BubbleSort.sort(array);
        
        for(Integer i : array){
            System.out.print(i + " ");
        }
    
    }
}
