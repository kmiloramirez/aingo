package dominio;

import java.util.ArrayList;

public class Factura {
	private int id, idMesa;
	public int getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}
	private double impuesto, totalNeto, propina, totalBruto;
	private String fecha, mensajeHeader, mensajeFooter;
	private ArrayList<Producto> productos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double getTotalNeto() {
		return totalNeto;
	}
	public void setTotalNeto(double totalNeto) {
		this.totalNeto = totalNeto;
	}
	public double getPropina() {
		return propina;
	}
	public void setPropina(double propina) {
		this.propina = propina;
	}
	public double getTotalBruto() {
		return totalBruto;
	}
	public void setTotalBruto(double totalBruto) {
		this.totalBruto = totalBruto;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMensajeHeader() {
		return mensajeHeader;
	}
	public void setMensajeHeader(String mensajeHeader) {
		this.mensajeHeader = mensajeHeader;
	}
	public String getMensajeFooter() {
		return mensajeFooter;
	}
	public void setMensajeFooter(String mensajeFooter) {
		this.mensajeFooter = mensajeFooter;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}  
	
}
