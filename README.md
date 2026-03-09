# ☕ Herencia POO 01 - Java

Este proyecto es una guía práctica y ejecutiva para comprender uno de los pilares fundamentales de la Programación Orientada a Objetos (POO): **La Herencia en Java**.

## 📌 Descripción del Proyecto

El proyecto está diseñado meticulosamente para demostrar a través de ejemplos funcionales de código cómo las clases en Java pueden heredar atributos y métodos, sobrescribirlos y comportarse de distintas maneras dependiendo de su tipo de instancia. Está organizado por paquetes temáticos para poder aislar e inspeccionar cada concepto individualmente.

## 🏗️ Estructura del Proyecto

El código fuente y todos los conceptos se encuentran divididos en dos paquetes principales ubicados en `src/`:

- **`execution`**: Contiene exclusivamente la clase `Principal.java`, el cual actúa como punto de arranque o ejecución para probar todo el proyecto.
- **`dominio`**: Agrupa lógicamente los dominios o categorías específicas de ejemplos en sub-paquetes:
  1. **`vehiculos`**: Herencia simple mediante el uso de `extends` y `super`. (Ej: `Vehiculo`, `Coche`)
  2. **`animales`**: Sobrescritura de métodos con `@Override`, enlace dinámico e interfaces demostrando múltiples capacidades. (Ej: `Animal`, `Perro`, `Pato`, `INadador`, `IVolador`)
  3. **`geometria`**: Uso de la palabra reservada `abstract` para crear contratos firmes en clases base. (Ej: `Figura`, `Circulo`, `Rectangulo`)
  4. **`utilidades`**: Uso extremo del modificador `final` en clases, métodos y variables constantes. (Ej: `ConstanteClase`)

## 💡 Conceptos Clave Explicados

### 1. Herencia Básica (`extends` y `super`)
La herencia permite crear nuevas clases que reutilizan, extienden o modifican el comportamiento definido en otras clases. En Java se usa la palabra reservada `extends`. 
- **`super()`**: Permite invocar explícitamente al constructor o a métodos de la superclase (padre) para inicializar variables heredadas y no duplicar lógica.
*Ejemplo implementado:* `Coche` extiende de `Vehiculo`.

### 2. Polimorfismo y Sobreescritura (`@Override`)
El polimorfismo permite que distintos objetos respondan a una misma invocación de método de formas diferentes. 
- **`@Override`**: Una anotación que le indica al compilador que la subclase está proporcionando su propia implementación para un método ya definido en su clase principal.
- **Upcasting**: Almacenar un objeto hijo (`Perro`) en una referencia de tipo padre (`Animal`). En tiempo de ejecución, Java llamará al método del objeto subyacente real (`Perro`).

### 3. Casting y el operador `instanceof`
A veces es necesario recuperar el tipo original (descendiente) a partir de una referencia genérica (ascendente) para usar métodos específicos de la subclase. A esto se le conoce como **Downcasting**.
- Es un error grave hacer casting a ciegas, por lo cual se utiliza una guardia evaluando con el operador `instanceof` para evitar la excepción `ClassCastException`: `if (miAnimal instanceof Perro)`.

### 4. Clases Abstractas (`abstract`)
Son clases diseñadas específicamente para ser plantillas base de otras; **no pueden ser instanciadas con `new`**. 
- Pueden incluir o no implementaciones generales, pero su principal característica es que pueden contener métodos abstractos (sin cuerpo) cuya firma es obligatoria, obligando a las clases hijas a construir su propia ejecución de dicha firma (Ej. `calcularArea()`).

### 5. Interfaces (`implements`) y Sobrecarga de Métodos
Como Java por diseño estructural prohíbe que una clase herede directamente atributos de dos clases (no hay herencia múltiple de clases), permite a cambio la herencia múltiple de comportamientos simulada mediante interfaces. Una clase puede usar `implements` para adoptar múltiples interfaces.
- Operan como "contratos" de capacidades (Ej. `IVolador`, `INadador`). Hasta versiones recientes de Java, casi todo método es público y abstracto por defecto.

**Sobrecarga de Métodos (Method Overloading):**
Permite que una clase o interfaz tenga múltiples métodos con el mismo nombre pero con **diferente lista de parámetros** (diferente cantidad o tipo de variables). Es una forma de polimorfismo en tiempo de compilación.
- *Ejemplo implementado:* En la clase `Pato` y `Perro` bajo el contrato `INadador`, el método `nadar()` fue sobrecargado con `nadar(int distancia)` y `nadar(int distancia, String estilo)`. Cada animal le dio su propia implementación biológica.

### 6. Modificador `final`
Este modificador restringe el comportamiento natural de alteración y herencia de la POO de las siguientes formas:
- **En variable**: Crea una constante cuyo valor de referencia es inmutable (`ConstanteClase.GRAVEDAD`).
- **En método**: Previene que cualquier subclase de la misma intente anular o sobrescribir su lógica usando `@Override`.
- **En clase**: "Sella" definitivamente la clase entera prohibiendo que sirva como padre (no se puede usar con un `extends`). Un ejemplo de diseño nativo en Java es la clase `String`, es una clase `final`.

## 🚀 Ejecución

Para probar el software y apreciar todas las salidas estándar de esta demostración, procede a compilar los archivos y ejecutar el compilado inicial principal de la clase `Principal`:

```shell
# Desde el directorio raíz del proyecto:

# 1. Compilamos enviando la salida a una carpeta "bin" oculta/separada:
javac -d bin -encoding UTF-8 src/execution/*.java src/dominio/vehiculos/*.java src/dominio/animales/*.java src/dominio/geometria/*.java src/dominio/utilidades/*.java

# 2. Ejecutamos indicando que el classpath local está en "bin":
java -cp bin execution.Principal
```
