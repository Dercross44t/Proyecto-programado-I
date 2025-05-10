package sodauniversitaria.Servidor;

/*
Titulo: Sistema de Pedidos en Línea para Soda Universitari
Integrantes: Martin Chavez Angulo C4E332,
Función: . Este proyecto busca simular un sistema de pedidos en línea, donde los estudiantes puedan realizar
sus órdenes desde sus computadoras o teléfonos en la red interna, y la soda reciba esos pedidos en tiempo real.
Versión: 0.1
 */
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Servidor {//Clase inicio

    //Lista de los productos a la venta
    static Map<String, Producto> listaProductos = new HashMap<>();
    //Puerto
    static final int puerto = 1234;

    public static void main(String[] args) {//Main inicio  
        listarProductos();
        
        try {//try inicio
            ServerSocket sodaServer = new ServerSocket(puerto);
            System.out.println("Servidor iniciado en el puerto: " + puerto);

            while (true) {//while inicio                
                Socket cliente = sodaServer.accept();
                System.out.println("Se conecto un cliente desde: " + cliente.getInetAddress());

                
            }//while fin
        } catch (Exception e) {//Try fin e catch inicio
            System.out.println("Error en el servidor " + e.getMessage());
        }//catch fin
    }//Main fin

    //Metodos
    public static void listarProductos() {//listarProductos inicio
        listaProductos.put("Gallo Pinto con huevo", new Producto("Gallo Pinto con huevo", 10, 800));
        listaProductos.put("Sándwich de jamón", new Producto("Sándwich de jamón", 8, 1000));
        listaProductos.put("Tortilla con queso", new Producto("Tortilla con queso", 15, 600));
        listaProductos.put("Papas fritas", new Producto("Papas fritas", 7, 400));
        listaProductos.put("Café negro", new Producto("Café negro", 13, 400));
        listaProductos.put("Jugo de naranja", new Producto("Jugo de naranja", 10, 500));
        listaProductos.put("Refresco natural", new Producto("Refresco natural", 10, 300));
        listaProductos.put("Agua mineral", new Producto("Agua mineral", 25, 200));
    }//listarProductos fin
}//Clase fin
