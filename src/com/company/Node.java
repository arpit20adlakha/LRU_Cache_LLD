package com.company;

// Node of the DoublyLinkedList
public class Node<E> {

     E value;
     Node prev = null;
     Node next = null;

    public Node(E value) {
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPrev(Node node) {
        this.prev = node;
    }
}
