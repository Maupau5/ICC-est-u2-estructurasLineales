# Ejercicios de Estructuras de Datos

Este repositorio contiene la solución a dos ejercicios implementados en Java, enfocados en el uso de estructuras de datos como pilas (stacks) y colas (queues). Cada ejercicio está diseñado para resolver un problema práctico utilizando estas estructuras.

---

## Ejercicios

### Ejercicio 01: Validación de Signos

**Descripción**

El objetivo de este ejercicio es implementar un validador que determine si una cadena de texto con paréntesis, llaves y corchetes está correctamente balanceada. Esto significa que cada apertura de un signo debe ser cerrada correctamente y en el orden adecuado.

**Implementación**

El validador utiliza una pila genérica para almacenar los signos abiertos y verificar que cada signo cerrado corresponda con el último signo abierto.

**Clase Principal**

- **Clase**: `SignValidator`
- **Método principal**: `isValid(String s)`

**Ejemplo de Uso**

```java
SignValidator validator = new SignValidator();
System.out.println(validator.isValid("{[()]}")); // true
System.out.println(validator.isValid("{[(])}")); // false
```

**Resultado Esperado**

| Cadena de Entrada | Resultado |
|-------------------|-----------|
| `{[()]}`         | `true`    |
| `{[(])}`         | `false`   |

---

### Ejercicio 02: Ordenar una Pila

**Descripción**

Este ejercicio implementa un algoritmo para ordenar una pila utilizando otra pila temporal. No se permite el uso de estructuras adicionales como arreglos o listas, solo pilas.

**Implementación**

La pila se ordena iterativamente, moviendo elementos entre la pila original y una pila temporal mientras se garantiza que los elementos más pequeños queden en la parte superior de la pila.

**Clase Principal**

- **Clase**: `StackSorter`
- **Método principal**: `sortStack(Stack stack)`

**Ejemplo de Uso**

```java
Stack<Integer> stack = new Stack<>();
stack.push(34);
stack.push(3);
stack.push(31);
stack.push(98);
stack.push(92);
stack.push(23);

StackSorter sorter = new StackSorter();
sorter.sortStack(stack);

stack.forEach(System.out::println); // 3, 23, 31, 34, 92, 98
```

**Resultado Esperado**

| Pila Original       | Pila Ordenada   |
|---------------------|-----------------|
| 34, 3, 31, 98, 92, 23 | 3, 23, 31, 34, 92, 98 |

---

## Ejecución

### Requisitos

- Java JDK 8+
- Visual Studio Code (con la extensión [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) instalada).

### Pasos

1. Clona el repositorio en tu máquina local.
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```
2. Abre Visual Studio Code y abre la carpeta del proyecto.
3. Asegúrate de tener configurado el entorno de Java en Visual Studio Code.
4. Compila y ejecuta la clase `App` para probar los ejercicios.

**Métodos Disponibles en `App`**

- `runSignValidator()`: Prueba el validador de signos balanceados.
- `runStackSorter()`: Prueba el algoritmo de ordenación de pilas.

### Ejecución desde la Terminal en Visual Studio Code

```bash
javac App.java
java App
```

---

## Estructura del Proyecto

```
|-- src/
    |-- Ejercicio_01_Sign/
        |-- SignValidator.java
    |-- Ejercicio_02_Sorting/
        |-- StackSorter.java
    |-- Materia/
        |-- Nodes/
            |-- NodeGeneric.java
        |-- Queues/
            |-- Queue.java
            |-- QueueGeneric.java
        |-- Stacks/
            |-- Stack.java
            |-- StackGeneric.java
    |-- App.java
```

---

¡Explora y utiliza estas soluciones para aprender más sobre estructuras de datos en Java!


