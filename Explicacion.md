# 📖 Ruta de Aprendizaje: Herencia en POO

Este documento sugiere el orden ideal para leer, entender y ejecutar el código de este proyecto. Sigue esta ruta paso a paso a través de los paquetes y la clase `Principal.java` para asimilar los conceptos de Programación Orientada a Objetos gradualmente.

---

### 1️⃣ Herencia Básica y reutilización de código
* **Rol:** Las bases de cómo una clase hija obtiene las propiedades de una clase padre.
* **Archivos a revisar:**
  1. `src/dominio/vehiculos/Vehiculo.java` (La Superclase base)
  2. `src/dominio/vehiculos/Coche.java` (La Subclase que hereda usando `extends`)
* **Concepto clave:** Uso de la palabra reservada `super()` para invocar el constructor del padre.

### 2️⃣ Polimorfismo y Enlace Dinámico 
* **Rol:** Entender cómo los objetos hijos pueden reinterpretar las reglas de sus padres.
* **Archivos a revisar:**
  1. `src/dominio/animales/Animal.java` (Declara un sonido genérico)
  2. `src/dominio/animales/Perro.java` (Modifica el sonido genérico por un ladrido)
* **Concepto clave:** Uso de la anotación `@Override` para sobrescribir métodos y el **Upcasting** (guardar un `Perro` en una variable de tipo `Animal`).

### 3️⃣ Downcasting seguro y el operador `instanceof`
* **Rol:** Cómo recuperar capacidades específicas de un objeto que está oculto bajo una abstracción más general.
* **Archivos a revisar:** `src/execution/Principal.java` (Sección 3 del método main)
* **Concepto clave:** Validar el tipo de un objeto real usando `instanceof` antes de forzar su conversión *(Downcasting)* para evitar errores en tiempo de ejecución.

### 4️⃣ Clases y Métodos Abstractos
* **Rol:** Creación de plantillas estrictas que delegan la responsabilidad de implementación a las subclases.
* **Archivos a revisar:**
  1. `src/dominio/geometria/Figura.java` (Define que toda figura DEBE poder calcular su área)
  2. `src/dominio/geometria/Circulo.java` y `Rectangulo.java` (Implementan la fórmula matemática específica)
* **Concepto clave:** La palabra `abstract` impide instanciar la clase padre (`new Figura()`) y fuerza a las hijas a escribir el código de los métodos abstractos.

### 5️⃣ Herencia Múltiple Simulada (Interfaces)
* **Rol:** Superar la limitación de Java que prohíbe que una clase herede atributos de dos padres distintos.
* **Archivos a revisar:**
  1. `src/dominio/animales/INadador.java` e `IVolador.java` (Los contratos de habilidades)
  2. `src/dominio/animales/Pato.java` (Un animal que suma el comportamiento de ambas interfaces)
* **Concepto clave:** El uso de `implements` para adoptar capacidades de múltiples orígenes.

### 6️⃣ Sobrecarga de Métodos (Method Overloading)
* **Rol:** Tener flexibilidad al llamar al mismo método de distintas maneras.
* **Archivos a revisar:** 
  1. `src/dominio/animales/INadador.java` (Firma de múltiples métodos `nadar()`)
  2. `src/dominio/animales/Perro.java` y `Pato.java` (Resolución de las firmas)
* **Concepto clave:** Un mismo nombre de método (`nadar()`) puede existir varias veces si la cantidad o el tipo de sus parámetros (los argumentos entre paréntesis) difieren.

### 7️⃣ El Cierre Hermético: Modificador `final`
* **Rol:** Proteger arquitecturas bloqueando la alteración y la herencia.
* **Archivos a revisar:** `src/dominio/utilidades/ConstanteClase.java`
* **Concepto clave:** 
  - `final` en una **variable**: Crea una constante inmutable (`GRAVEDAD`).
  - `final` en un **método**: Evita que una subclase le haga `@Override`.
  - `final` en una **clase**: Prohíbe totalmente que la clase sea usada en un `extends`.
