
import estruturas.LinkedQueue;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class CorrectQueueTest extends TestCase {
    
    
    @Test
    
    public void testEnqueue(){
        
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        Integer correct[] = {1,2,3,4};
        Integer[] test = new Integer[correct.length];
       
        queue.enqueue(1);
        queue.enqueueWithPriority(-1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        
        for(int i = 0; i < correct.length; i++){
            test[i] = queue.get(i);
        }
        
        System.out.println("Result:");
        queue.iterate();
        System.out.println("\nExpected:");
        for(Integer e: correct){
            System.out.println(e);
        }
   
        assertArrayEquals(correct, test);
    }
}
