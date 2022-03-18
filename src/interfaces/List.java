/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author mateu
 */
public interface List<Item> extends Iteration {
     
    public boolean isEmpty();
    public void add(Item item);
    public void addFirst(Item item);
    public void addLast(Item item);
    public Item get(int index);
    public Item remove(int index);
    public Item removeFirst();
    public Item removeLast();
    public Item getFirst();
    public Item getLast();
}
