/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico3;
import javax.swing.JOptionPane;
/**
 *
 * @author Fabian
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidadeProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos:"));
        Productos tienda = new Productos(cantidadeProductos);
        tienda.mostrarTotalesPorProducto();
        tienda.mostrarDiaMayorVentas();
        tienda.mostrarProductoMasVendido();
    }
    
}
