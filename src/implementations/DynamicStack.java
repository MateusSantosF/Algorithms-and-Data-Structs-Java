package implementations;

import exceptions.StackException;
import interfaces.Stack;

/**
 *
 * @author Mateus Santos
 */
public class DynamicStack<Item> implements Stack {
          
    private Node<Item> topo;
    private int tam;

    @Override
    public Item desempilhar() {
        if(estaVazia()) throw new StackException("Pilha Vazia - Erro Desempilha");
        Item item = topo.item;
        topo = topo.ant;
        tam--;
        return item;
    }

    @Override
    public boolean estaVazia() {
        return (topo == null);
    }

    @Override
    public Item topo() {
        if(estaVazia()) throw new StackException("Pilha Vazia - Erro Topo");
        return topo.item;
    }

    @Override
    public int tamanho() {
        return tam;
    }

    @Override
    public void iterate() {
        while(!estaVazia()){
            System.out.println("Desempilhou: "+topo.item.toString());
            desempilhar();
        }
    }

    @Override
    public void empilhar(Object item) {
        Node<Item> anterior = topo;
        topo = new Node<Item>();
        topo.item = (Item) item;
        topo.ant = anterior;
        tam++;
    }
    
    private static class Node<Item>{
        private Item item;
        private Node<Item> ant;
    }
    
    public DynamicStack(){
        topo = null;
        tam = 0;
    }
    
    
}
