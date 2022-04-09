package implementations;

import exceptions.StackException;
import interfaces.Stack;

/**
 *
 * @author Mateus Santos
 */
public class DynamicStack<Item> implements Stack {
          
    private Node<Item> top;
    private int size;

    @Override
    public Item pop() {
        if(isEmpty()) throw new StackException("Pilha Vazia - Erro Desempilha");
        Item item = top.item;
        top = top.ant;
        size--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public Item peek() {
        if(isEmpty()) throw new StackException("Stack is Empty");
        return top.item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void iterate() {
        while(!isEmpty()){
            System.out.println("pop : "+top.item.toString());
            pop();
        }
    }

    @Override
    public void push(Object item) {
        Node<Item> anterior = top;
        top = new Node<Item>();
        top.item = (Item) item;
        top.ant = anterior;
        size++;
    }
    
    private static class Node<Item>{
        private Item item;
        private Node<Item> ant;
    }
    
    public DynamicStack(){
        top = null;
        size = 0;
    }
    
    
}
