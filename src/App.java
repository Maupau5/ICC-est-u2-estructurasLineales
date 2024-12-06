import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        runStackGeneric();
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

    public static void runStackGeneric() {
        // Instanciar la clase
        StackGeneric<Pantalla> router = new StackGeneric<>();

        // Agregar elementos a la fila.
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/usuarios"));

        // Mostrar los valores.
        System.out.println("Estoy en "+router.peek().getRuta());
        System.out.println("Regreso a "+router.popNode().getNext().getValue().getRuta());
        System.out.println("Estoy en "+router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));
        System.out.println("Pantallas = "+ router.getSize());
        System.out.println("Estoy en "+router.peek().getRuta());
        
        router.printStack();
        
    }
}
