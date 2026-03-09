package execution;

import dominio.vehiculos.*;
import dominio.animales.*;
import dominio.geometria.*;
import dominio.utilidades.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== 1. HERENCIA BÁSICA Y super() ===");
        Coche miCoche = new Coche("Toyota", "Corolla", 2022, 4);
        miCoche.arrancar(); // Llama al método sobreescrito
        miCoche.activarAireAcondicionado();

        System.out.println("\n=== 2. POLIMORFISMO Y @Override ===");
        Animal miAnimal = new Animal("Bestia");
        miAnimal.hacerSonido();

        // Upcasting: Asignar un objeto hijo a una referencia del padre
        Animal miPerro = new Perro("Firulais");
        miPerro.hacerSonido(); // Llama a la versión de Perro (Polimorfismo dinámico)

        System.out.println("\n=== 3. CASTING EXPLICITO Y instanceof ===");
        // miPerro.ladrarFuerte(); // Error de compilación porque el tipo de referencia
        // es Animal

        // Uso de instanceof de manera segura antes del Downcasting
        if (miPerro instanceof Perro) {
            // Downcasting: Convertir la referencia padre en hija explícitamente
            Perro p = (Perro) miPerro;
            p.ladrarFuerte();
            p.nadar();
        }

        System.out.println("\n=== 4. CLASES Y MÉTODOS ABSTRACTOS ===");
        // Figura fig = new Figura("Rojo"); // ERROR: No se puede instanciar abstractas
        Figura circulo = new Circulo("Rojo", 5.0);
        Figura rectangulo = new Rectangulo("Azul", 4.0, 6.0);

        circulo.mostrarColor();
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        System.out.println("\n=== 5. INTERFACES (Herencia Múltiple de Tipos) ===");
        Pato patoLucas = new Pato("Lucas");
        patoLucas.hacerSonido();
        patoLucas.volar();
        System.out.println("\n--- Sobrecarga de métodos en Pato (INadador) ---");
        patoLucas.nadar();
        patoLucas.nadar(50);
        patoLucas.nadar(100, "Mariposa");
        System.out.println("Altitud máxima de vuelo: " + IVolador.ALTITUD_MAXIMA + " metros.");

        System.out.println("\n=== 6. MODIFICADOR final ===");
        System.out.println("Gravedad terrestre: " + ConstanteClase.GRAVEDAD);
        ConstanteClase cc = new ConstanteClase();
        cc.mostrarMensajeFijo();

        System.out.println("\n--- Ejecución completada exitosamente ---");
    }
}
