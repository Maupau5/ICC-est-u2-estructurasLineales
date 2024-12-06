package Materia.Queues;

import java.util.NoSuchElementException;

import Materia.Models.NodeGeneric;

public class QueueGeneric<T> {
    private NodeGeneric<T> front; //Nodo al frente de la cola
    private NodeGeneric<T> rear; // Nodo al fiinal de la cola

    public QueueGeneric() {
        this.front = null;
        this.rear = null;
    }

    // Metodo para encolar nodos.
    public void enqueue(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;

        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    // Desencolar
    public NodeGeneric<T> dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        NodeGeneric<T> node = front;
        front = front.getNext();
        if(front == null) {
            rear = null;
        }
        return node;
    }

    // Devuelve
    public NodeGeneric<T> peek(){
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return front;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        NodeGeneric<T> current = front;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int getSize() {
        int size = 0;
        NodeGeneric<T> current = front;
        while(current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    } 
}
