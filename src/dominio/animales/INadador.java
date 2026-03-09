package dominio.animales;

// Interfaz con ejemplos de sobrecarga de métodos (Method Overloading)
public interface INadador {
    // Método original
    void nadar();

    // Sobrecarga 1: Mismo nombre, diferente cantidad de parámetros
    void nadar(int distancia);

    // Sobrecarga 2: Mismo nombre, múltiples parámetros
    void nadar(int distancia, String estilo);
}
