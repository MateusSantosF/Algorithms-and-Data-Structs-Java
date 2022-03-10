
import estruturas.LinkedQueue;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

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
        int correct[] = {1,2,3};
        int[] test = new int[3];
       
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
   
        test[0] = queue.dequeue();
        test[1] = queue.dequeue();
        test[2] = queue.dequeue();
  

        Assert.assertEquals(correct[1], test[1]);
    }
}
