/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

import excessao.ListException;
import interfaces.List;

/**
 *
 * @author Mateus Santos 
 * @Github MateusSantosF
 * @param <Item>
 */
public class LinkedList<Item> implements List<Item> {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    private class Node {

        Item item;
        Node next;
    }
        
    @Override
    public Item remove(int index) {

        if (index > size || index < 0) {
            throw new ListException("Index out of range");
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == size) {
            return removeLast();
        }
       
        Node temp = first;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
       
        Node removed = temp.next;
        Node newConnection = removed.next;
        temp.next = newConnection;
       
        return removed.item;
       

    }

    @Override
    public Item removeFirst() {
        if (isEmpty()) {
            throw new ListException("List is empty!");
        }

        Node removed = first;
        if (first.next == null) {
            first = null;
            last = null;
        } else {
            first = first.next;
        }
        size--;

        return removed.item;
    }

    @Override
    public Item removeLast() {
        if (isEmpty()) {
            throw new ListException("List is empty!");
        }

        Node aux = first;
        while (aux.next.next != null) {
            aux = aux.next;
        }

        aux.next = null;
        last = aux;
        size--;

        return aux.item;
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
        if (isEmpty()) {
            first = newNode;
            last = newNode;

        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public void addFirst(Item item) {

        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        if (isEmpty()) {
            first = newNode;
            last = newNode;

        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    @Override
    public void addLast(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        if (isEmpty()) {
            first = newNode;
            last = newNode;

        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public Item get(int index) {
        if (index > size || index < 0) {
            throw new ListException("Index out of range");
        }
        Node temp = first;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.item;
    }

    @Override
    public Item getFirst() {
        return first != null ? first.item : null;
    }

    @Override
    public Item getLast() {

        return last != null ? last.item : null;
    }

    @Override
    public void iterate() {

        Node aux = first;
        while (aux != null) {
            System.out.println(aux.item);
            aux = aux.next;
        }
    }
    


}