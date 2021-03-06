
import implementations.LinkedList;
import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;
import org.junit.Test;


/**
 *
 * @author Mateus Santos
 * @Github MateusSantosF
 */
public class CorrectListTest extends TestCase {
    
    @Test
    public void testList01(){
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        Integer arr[] = {1,-1,2,3,5};
        Integer arrTest[] = new Integer[arr.length];
        
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.addFirst(-1);
        linkedList.remove(1);
        linkedList.add(0,1);
        
        for(int i = 0; i < arr.length; i++){
            arrTest[i] = linkedList.get(i);
        }
        System.out.println("Result:");
        linkedList.iterate();
        System.out.println("\nExpected:");
        for (Integer arr1 : arr) {
            System.out.println(arr1);
        }
        
      
        assertArrayEquals(arr, arrTest);
        
    }
    
}
