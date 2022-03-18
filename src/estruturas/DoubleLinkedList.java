/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturas;

import interfaces.List;

/**
 *
 * @author mateu
 */
public class DoubleLinkedList<Item> implements List<Item> {

    int size;
    Node first;
    Node last;
    
    
    public void DoubleLinkedList(){
        size = 0;
        first = null;
        last = null;
    }
    
    private class Node{
        Item item;
        Node next;
        Node previous;
    }
    
    @Override
    public boolean isEmpty() {
      
        return size <= 0;
    }

    @Override
    public void add(Item item) {
        
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        newNode.previous = last;
        
        if(isEmpty()){
            
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public void addFirst(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item get(int index) {
        
        Node temp = first;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        
        return temp.item;
    }

    @Override
    public Item remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iterate() {
        
        Node temp = first;
        while( temp != null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }
    
    public void iterate(boolean reverse){
        if(reverse){
            Node temp = last;
            while(temp != null){
                System.out.println(temp.item);
                temp = temp.previous;
            }
        }else{
            iterate();
        }
    }
    
}
