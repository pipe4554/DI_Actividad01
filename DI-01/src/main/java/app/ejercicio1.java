package app;

import java.util.*;

import models.Factura;
import models.Producto;
import models.Producto.Impuesto;
import models.*;

public class ejercicio1 {
		
	static Producto producto;
	static Factura factura;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List <Producto> productos = new ArrayList<>();
		
		
		producto = new Producto(0.75 , "Leche", null);
		productos.add(producto);
		
		producto = new Producto(0.50 , "Pan", null);
		productos.add(producto);
		
		producto = new Producto(8.99 , "Salmon", null);
		productos.add(producto);
		
		producto = new Producto(2.95 , "Aguacates", null);
		productos.add(producto);
		
		producto = new Producto(1.20 , "Friegasuelos", null);
		productos.add(producto);
		
		producto = new Producto(0.56 , "Cerveza", null);
		productos.add(producto);
		
		producto = new Producto(1.45 , "Sandia", null);
		productos.add(producto);
		
		factura = new Factura(0 , productos, null); 
		factura.visual();
		
			
	}
	
		
		
		
		

	}


