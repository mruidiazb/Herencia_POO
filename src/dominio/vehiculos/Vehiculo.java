package dominio.vehiculos;

/**
 * Clase Base (Superclase)
 * Demuestra la definición de una clase de la cual otras pueden heredar.
 */
public class Vehiculo {
    // Atributos protegidos: accesibles por clases hijas y clases del mismo paquete
    protected String marca;
    protected String modelo;
    private int ano; // Atributo privado: sólo accesible con getters/setters

    // Constructor vacío (por defecto)
    public Vehiculo() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.ano = 0;
        System.out.println("Vehiculo: Constructor sin parámetros invocado.");
    }

    // Constructor con parámetros
    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        System.out.println("Vehiculo: Constructor con parámetros invocado.");
    }

    // Método que será heredado
    public void arrancar() {
        System.out.println("El vehículo " + marca + " " + modelo + " está arrancando.");
    }

    // Getters y Setters
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
