/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Fabian
 */

public class Productos {

    private String[] productos;
    private int[][] ventas;

    public Productos(int n) {
        productos = new String[n];
        ventas = new int[7][n];
        ingresarProductos();
        generarVentas();
    }
    

    private void ingresarProductos() {
        /// Le pregunto al usuario el nombre del producto 
        for (int i = 0; i < productos.length; i++) {
            productos[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
        }
    }

    private void generarVentas() {
        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            for (int f = 0; f < productos.length; f++) {
                ventas[i][f] = rand.nextInt(10);
            }
        }
    }

    public void mostrarTotalesPorProducto() {
        String mensaje = "Total de ventas por producto:\n";
        for (int f = 0; f < productos.length; f++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventas[i][f];
            }
            mensaje += productos[f] + ": " + total + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarDiaMayorVentas() {
        int maxVentas = 0;
        int diaMayor = 0;
        for (int i = 0; i < 7; i++) {
            int totalDia = 0;
            for (int f = 0; f < productos.length; f++) {
                totalDia += ventas[i][f];
            }
            if (totalDia > maxVentas) {
                maxVentas = totalDia;
                diaMayor = i;
            }
        }
        String[] dias = {
            "Lunes", 
            "Martes", 
            "Miércoles", 
            "Jueves", 
            "Viernes", 
            "Sábado", 
            "Domingo"
            };
        JOptionPane.showMessageDialog(null, "El día con más ventas es " + dias[diaMayor] + " con " + maxVentas + " ventas.");
    }

    public void mostrarProductoMasVendido() {
        int maxVentas = 0, productoMayor = 0;
        for (int f = 0; f < productos.length; f++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventas[i][f];
            }
            if (total > maxVentas) {
                maxVentas = total;
                productoMayor = f;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto más vendido es " + productos[productoMayor] + " con " + maxVentas + " unidades.");
    }
}  