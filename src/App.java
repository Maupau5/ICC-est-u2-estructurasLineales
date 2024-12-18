import Materia.Models.Pantalla;
import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;

public class App {
    public static void main(String[] args) throws Exception {
        // runStack();
        // runStackGeneric();
        // runQueue();
        // runQueueGeneric();
        runSignValidator();
        runStackSorter();
    }

    public static void runStack() {
        // Instanciar la clase
        Stack stack = new Stack();

        // Agregar elementos a la fila.
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        // Mostrar los valores.
        System.out.println("Cima   -> " + stack.peek());
        System.out.println("Retirar-> " + stack.pop());
        System.out.println("Cima   -> " + stack.peek());
        System.out.println("Retirar-> " + stack.pop());
        System.out.println("Cima   -> " + stack.peek());
        System.out.println("Retirar-> " + stack.pop());
        System.out.println("Cima   -> " + stack.peek());
        System.out.println("Retirar-> " + stack.pop());
    }

    public static void runStackGeneric() {
        // Instanciar la clase
        StackGeneric<Pantalla> router = new StackGeneric<>();

        // Agregar elementos a la fila.
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/usuarios"));

        // Mostrar los valores.
        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + router.popNode().getNext().getValue().getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));
        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.printStack();

    }

    public static void runQueue() {
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());

        cola.printQueue();
        System.out.println(cola.getSize());
    }

    public static void runQueueGeneric() {
        QueueGeneric cola = new QueueGeneric<>();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());

        cola.printQueue();
        System.out.println(cola.getSize());
    }

    public static void runSignValidator() {
        Ejercicio_01_Sign.SignValidator validator = new Ejercicio_01_Sign.SignValidator();

        String validString = "{[()]}";
        String invalidString = "{[(])}";

        System.out.println("Validating string: " + validString);
        System.out.println("Is valid? " + validator.isValid(validString));

        System.out.println("Validating string: " + invalidString);
        System.out.println("Is valid? " + validator.isValid(invalidString));
    }

    public static void runStackSorter() {
        Materia.Stacks.Stack stack = new Materia.Stacks.Stack();

        // Adding elements to the stack
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        stack.printStack();

        Ejercicio_02_Sorting.StackSorter sorter = new Ejercicio_02_Sorting.StackSorter();
        sorter.sortStack(stack);

        System.out.println("Sorted Stack:");
        stack.printStack();
    }
}
