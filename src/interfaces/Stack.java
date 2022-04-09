package interfaces;

/**
 *
 * @author Mateus Santos
 */

public interface Stack<Item> extends Iteration{
    public void push(Item item);
    public Item pop();
    public boolean isEmpty();
    public Item peek();
    public int size();
}
