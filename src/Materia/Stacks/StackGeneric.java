package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Nodes.NodeGeneric;

public class StackGeneric<T> {
    private NodeGeneric<T> top;
    private int size; // Variable del tamanño O(1)

    // Crea una fila instanciando el nodo top en null y el tamaño en 0
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        newNode.setNext(top);
        top = newNode;
        size++;

    }

    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
    public boolean isEmpty() {
        return top == null;
    }

    public NodeGeneric<T> popNode() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodeGeneric<T> value = top;
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void printStack() {
        NodeGeneric<T> current = top;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
        
    }
    public int getSize() {
        int size = 0;
        NodeGeneric<T> current = top;
        while(current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}
