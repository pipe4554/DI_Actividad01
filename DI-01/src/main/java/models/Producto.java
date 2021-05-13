package models;

public class Producto {
	
	

	public Producto(double importe, String descripcion ,  Impuesto tipoImpuesto ) {
		this.importe = importe;
		this.descripcion = descripcion;
		this.tipoImpuesto = tipoImpuesto;
		
	}
	
	
	private double importe;
	private String descripcion;
	private Impuesto tipoImpuesto;
	
	
	public enum Impuesto {
		
	SUPERREDUCIDO(0.4) , REDUCIDO(0.1) , NORMAL(0.21);
	
	private Impuesto(double valorImpuesto) {
		
		this.valorImpuesto = valorImpuesto; 
		}
	private double valorImpuesto;

	public double getValorImpuesto() {
		return valorImpuesto;
	}
	public void setValorImpuesto(double valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}
	
	}
	
	
	public double getImporte() {
		return importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	@Override
	public String toString() {
		return "Producto: importe=" + importe + ", descripcion=" + descripcion;
	}
	
	public void visual()
	{
		System.out.println ("Tipo de producto: " + descripcion + " Importe " + importe + "€ " + "Tipo de impuesto: " + tipoImpuesto );
	}
	
	public Impuesto getTipoImpuesto() {
		return tipoImpuesto;
	}
	public void setTipoImpuesto(Impuesto tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}
	
	
	
}