package models;

import java.util.*;
import models.Producto;

public class Factura {

	private int numero;
	private List<Producto> productos;
	private Date fechaRealizacion;

	public Factura(int numero, List<Producto> productos , Date fechaRealizacion) {
		super();
		this.numero = numero;
		this.productos = productos;
		this.fechaRealizacion = fechaRealizacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	public Date getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}
	
	

	@Override
	public String toString() {
		return "Factura: numero=" + numero + ", productos=" + productos;
	}
	
	public void visual()
	{
		for (Producto a:productos)
		{
			a.visual();
		}
	}

}
