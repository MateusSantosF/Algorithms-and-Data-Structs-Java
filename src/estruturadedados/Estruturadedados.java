package estruturadedados;

import estruturas.LinkedQueue;
import estruturas.PilhaArray;
import estruturas.DynamicStack;
import modelo.Livro;

public class Estruturadedados {

    public static void main(String[] args) {
       
       LinkedQueue<Integer> queue = new LinkedQueue<>();
       
       queue.enqueue(1);
       queue.enqueueWithPriority(-4);
       queue.enqueue(2);
       queue.enqueue(3);
       queue.enqueue(4);
       queue.enqueueWithPriority(5);
       queue.enqueueWithPriority(10);
       queue.iterate();
     
    }
}
