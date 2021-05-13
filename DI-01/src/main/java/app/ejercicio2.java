package app;
import java.util.*;


import models.Factura;
import models.Producto;
import models.Producto.Impuesto;
import utils.UtilidadesFactura;



public class ejercicio2 {
		
	static Producto producto;
	static Factura factura;
	static Impuesto impuestos;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List <Producto> productos = new ArrayList<>();
		
		
		
		producto = new Producto(0.75 , "Leche" , impuestos = Impuesto.REDUCIDO);
		productos.add(producto);
		
		producto = new Producto(0.50 , "Pan" , impuestos = Impuesto.SUPERREDUCIDO);
		productos.add(producto);
		
		producto = new Producto(8.99 , "Salmon", impuestos = Impuesto.REDUCIDO);
		productos.add(producto);
		
		producto = new Producto(2.95 , "Aguacates", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(1.20 , "Friegasuelos", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(0.56 , "Cerveza", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(1.45 , "Sandia", impuestos = Impuesto.SUPERREDUCIDO);
		productos.add(producto);
		
		factura = new Factura(0 , productos, new Date()); 
		factura.visual();
		
		System.out.println("\nImporte sin IVA: " + UtilidadesFactura.calcularImporteFactura(factura));
		
		System.out.println("Calcular Factura sin IVA : " + UtilidadesFactura.calcularIVAFactura(factura));
		
		System.out.println("Calcular FActura con IVA : " + UtilidadesFactura.calcularIVAFacturaConIVA(factura));
			
	}
}
		
		
		
			
			