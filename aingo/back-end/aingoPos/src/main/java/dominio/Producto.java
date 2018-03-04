package dominio;

public class Producto {
    private int codigo, cantidad;
    public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private String nombre;
    double precioCompra, precioVenta;
    

    public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Producto(int codigo, String nombre ){
        this.codigo=codigo;
        this.nombre=nombre;
    }
    public int getCodigo(){
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
