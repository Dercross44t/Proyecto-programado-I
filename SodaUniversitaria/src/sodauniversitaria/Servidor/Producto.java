package sodauniversitaria.Servidor;

public class Producto {//clase inicio

    //Atributos
    private String nombre;
    private int stock, precio;

    //Constructor
    public Producto(String nombre, int stock, int precio) {//Constructor inicio
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }//Constructor final

    //Getters inicio
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public int getPrecio() {
        return precio;
    }//Getters fin

    //Metodos
    public synchronized boolean reducirStock(int cantidad) {//reducirStock inicio
        if (stock >= cantidad) {//if inicio
            stock -= cantidad;
            return true;
        } else if (stock <= cantidad) {//if fin y else if inicio
            return false;
        } else {//else if fin y else inicio
            return false;
        }//else inicio
    }//reducirStock fin
}//Clase final
