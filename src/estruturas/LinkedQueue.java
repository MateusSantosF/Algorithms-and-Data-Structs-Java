/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

import excessao.QueueException;
import interfaces.Queue;

/**
 *
 * @author aluno
 */
public class LinkedQueue<Item> implements Queue<Item> {
    
    Node first;
    Node last;
    
    public LinkedQueue(){
        first = null;
        last = null;
    }

    @Override
    public void enqueueWithPriority(Item i) {
        
        Node newNode = new Node();
        newNode.nextNode = null;
        newNode.value = i;
        
       if(first == null){
          first = newNode;
          last = newNode; 
       }else{
          
        Node temp = first;
        newNode.nextNode = first;
        first = newNode;
           
       }
           
    }

    @Override
    public Item get(int index) {
        if(index > size())
            throw new QueueException("Index out of range");
        
        Node temp = first;
        for(int i = 0; i < index; i++){
            temp = temp.nextNode;
        }
        return temp.value;
    }
    
    private class Node{
        Node nextNode;
        Item value;
    }

    @Override
    public void enqueue(Item i) {
       
        Node newNode = new Node();
        newNode.value = i;
        newNode.nextNode = null;
        
        if( first == null){
            first = newNode;
            last = newNode;
        }else{
            Node temp = first;
            while(temp.nextNode != null){
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
            last = newNode;
        }
    }

    @Override
    public Item dequeue() {
        if(size() == 0){
            throw new QueueException("Queue empty");
        }
        Node temp = first;
        first = first.nextNode;
      
        return temp.value;
    }

    @Override
    public int size() {
        
        int size = 0;
        Node temp = first;
        while(temp != null){
            temp = temp.nextNode;
            size++;
        }
        
        return size;
    }

 

    @Override
    public Item peek() {
        return last.value;
    }

    @Override
    public boolean isEmpty() {
        return size() >= 0;
    }

    @Override
    public void iterate() {
        
        Node temp = first;
        
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
    }
    
    

   
}
