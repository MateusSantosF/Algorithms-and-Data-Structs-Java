package interfaces;

public interface Stack<Item> extends Iteration{
    public void empilhar(Item item);
    public Item desempilhar();
    public boolean estaVazia();
    public Item topo();
    public int tamanho();
}
