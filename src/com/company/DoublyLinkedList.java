package com.company;

import java.util.Map;

public class DoublyLinkedList<T, E> {
    private Node<E> head = null;
    private Node<E> last = null;

    public Node<E> add(E value) {
        if (head == null) {
            head = new Node<E>(value);
            last = head;
            return head;
        } else {
            Node<E> temp = new Node(value);
            temp.next = head;
            head.prev = temp;
            head = temp;
            return temp;
        }
    }

    public void removeLast(Map<T, Node> map) {
        map.remove(last);
        last.prev.next = null;
        last = last.prev;
    }

    // Helper function
    public Node<E> moveToFront(Map<T, Node> map, T key) {
       Node<E> temp = map.get(key);
       map.remove(key);
       this.removeNode(temp);
        return this.add(temp.value);
    }

    public void removeNode(Node<E> removingNode) {
        removingNode.prev.next = removingNode.next;
        removingNode.next.prev = removingNode.prev;
    }

}
