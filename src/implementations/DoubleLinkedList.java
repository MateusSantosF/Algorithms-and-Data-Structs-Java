/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementations;

import exceptions.ListException;
import interfaces.List;

/**
 *
 * @author Mateus Santos
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
    
    public void add(int index, Item item){
        
        if(index > size || index < 0)
            throw new ListException("Index out of bounds");
        
        if(index == 0){
            addFirst(item);
        }else if(index == size){
            add(item);
        }else{
            Node newNode = new Node();
            newNode.item = item;
            
            Node temp = first;
            
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            
            Node tempPrevious = temp.previous;
            tempPrevious.next = newNode;
            newNode.previous = tempPrevious;
            newNode.next = temp;
            temp.previous = newNode;
            
            size++;
            
            
        }
           
    }

    @Override
    public void addFirst(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        newNode.previous = null;
        
        first.previous = newNode;
        first = newNode;
        
        size++;
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
        
        if(index > size || index < 0)
            throw new ListException("Index out of range");
        
        if(index == 0){
           return removeFirst();
        }else if(index == size){
           return removeLast();
        }else{
            
            Node temp = first;
            
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            
            Node tempPrevius = temp.previous;
            Node tempNext = temp.next;
            
            tempPrevius.next = tempNext;
            tempNext.previous = tempPrevius;
            size--;
            
            return temp.item;
        }
    }

    
    @Override
    public Item removeFirst() {
        if(isEmpty())
            throw new ListException("List is Empty!");
       Node temp = first;
       first = temp.next;
       
       if(first == null){
           first = null;
           last = null;
       }else{
           first.previous = null;
       }
       
       
       size--;
       
       return temp.item;
    }

    @Override
    public Item removeLast() {
        
        if(isEmpty())
            throw new ListException("List is Empty!");
        
        if(size == 1){
            Item i = first.item;
            first = null;
            last = null;
            size--;
            return i;
        }
        
        Node temp = first;
 
        for(int i = 0; i < size - 2; i++){
            temp = temp.next;
        }
   
        last = temp;
        last.next = null;
        last.previous = temp.previous;
        
        size --;
        return temp.item;
    }

    @Override
    public Item getFirst() {
        return first.item;
    }

    @Override
    public Item getLast() {
        return last.item;
    }

    @Override
    public void iterate() {
        
        Node temp = first;
        while( temp != null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }
    
    @Override
    public int length(){
        return size;
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
