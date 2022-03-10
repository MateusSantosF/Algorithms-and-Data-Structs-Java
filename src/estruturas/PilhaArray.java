package estruturas;

import excessao.StackException;

public class PilhaArray{
    
    private int elementos[];
    private int topo;
    
    public PilhaArray(){
        elementos = new int[10];
        topo = -1;
    }
    
    public void empilhar(int e) {
        if(estaCheia()) throw new StackException("ERRO EMPILHAR");
        topo++;
        elementos[topo] = e;
    }

    public int desempilhar() {
        if(estaVazia()) throw new StackException("ERRO DESEMPILHAR");
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean estaVazia() {
        return (topo == -1);
    }

    public boolean estaCheia() {
        return (topo == 9);
    }

    public int topo() {
        if(estaVazia()) throw new StackException("Erro TOPO");
        return elementos[topo];
    }

    public int tamanho() {
        return topo + 1;
    }

    public void percorrer() {
        while(!estaVazia()){
            System.out.println("Desempilhou: "+desempilhar());
        }
    }
    
}
