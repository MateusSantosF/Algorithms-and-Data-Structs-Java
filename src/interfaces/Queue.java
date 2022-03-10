/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Mateus Santos Ferreira - BV008363
 * @param <Item>
 */
public interface Queue<Item> extends Iteration {
    
    public void enqueue(Item i);
    public Item dequeue();
    public int size();
    public void enqueueWithPriority(Item i);
    public Item peek();
    public boolean isEmpty();
    
}
