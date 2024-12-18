package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Nodes.Node;

public class Stack {
    private Node top; // Nodo en la cima de nuestra pila.
    private int size;

    // Creamos la pila con la cima nula o vacia.
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }
    // Metodo que retira el nodo de la cima.
    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
    // Metodo que retorna el valot del node de la cima.
    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    
    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    // Metodo que retorna el tamaño de la pila.
    // complejidad 0(n)
    /*public int getSize() {
        int size = 0;
        Node current = top;
        while(current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    } */

    // complejidad 0(1)
    public int getSize() {
        return size;
    }
}
