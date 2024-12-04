import Materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
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
        System.out.println("Cima   -> "+stack.peek());
        System.out.println("Retirar-> "+stack.pop());
        System.out.println("Cima   -> "+stack.peek());
        System.out.println("Retirar-> "+stack.pop());
        System.out.println("Cima   -> "+stack.peek());
        System.out.println("Retirar-> "+stack.pop());
        System.out.println("Cima   -> "+stack.peek());
        System.out.println("Retirar-> "+stack.pop());
        
    }
}
