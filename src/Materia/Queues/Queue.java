package Materia.Queues;

import java.util.NoSuchElementException;

import Materia.Nodes.Node;

public class Queue {
    private Node front; //Nodo al frente de la cola
    private Node rear; // Nodo al fiinal de la cola

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Metodo para encolar nodos.
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;

        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    // Desencolar
    public Node dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        Node node = front;
        front = front.getNext();
        if(front == null) {
            rear = null;
        }
        return node;
    }

    // Devuelve
    public Node peek(){
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return front;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        Node current = front;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int getSize() {
        int size = 0;
        Node current = front;
        while(current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    } 
}
