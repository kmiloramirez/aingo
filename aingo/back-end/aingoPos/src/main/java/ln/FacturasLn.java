package ln;
import java.util.ArrayList;
import java.util.Calendar;
import dominio.Factura;
import dominio.Producto;
/* en esta clase vamos a realizar la creacion y logica de una factura
 * Creada por Paulo Andres Escobar
 * */
public class FacturasLn {
	private Factura factura;
	private double precioFactura;
	boolean swInclyePropina = false;
	
	
	
	/*En este metodo crearemos la factura vacia solo con los campos predeterminados como
	 * son los mensajes, la fecha, la mesa*/
	public boolean crearFactura(String header, String footer, int idMesa, double impuesto) 
	{
			factura = new Factura();
			this.precioFactura=0;
			try {
			Calendar cal = Calendar.getInstance();
			Integer dia = cal.get(Calendar.DAY_OF_MONTH);
			Integer mes = cal.get(Calendar.MONTH);
			Integer ano = cal.get(Calendar.YEAR);
			String fecha = dia.toString()+"/"+mes.toString()+"/"+ano.toString();
			factura.setFecha(fecha);
			factura.setMensajeHeader(header);
			factura.setMensajeFooter(footer);
			factura.setTotalBruto(0);
			factura.setTotalBruto(0);
			factura.setImpuesto(impuesto);
			factura.setIdMesa(idMesa);	
			}
			catch (Exception e) 
			{
				return false;
			}
		return true;
	}
	
	
	
	/* en este metodo se adicionan los productos a un plato e invoca al metodo que resta a la cantidad de ese producto
	 * ejemplo si se adiciona 3 cocacolas se descuentan de donde dice producto cantidad en la base de datos 
	 * en la tabla producto el atributo cantidad*/
	public boolean adicionarProducto(Factura factura,Producto producto, int cantidad) {
		
		ArrayList<Producto>  productos = factura.getProductos();
		productos.add(producto);
		this.precioFactura +=producto.getPrecioVenta(); 
		producto.setCantidad(producto.getCantidad()-cantidad);
		return true;
		
	}
	
	/*este metodo se encarga de finalizar la factura y recibe como parametro si desea incluir la propina
	 * creado por Paulo Andres Escobar*/
	public void finalizaFactura(boolean incluyePropina) {
		
		swInclyePropina = incluyePropina;
		if(swInclyePropina) {
			factura.setPropina(precioFactura*0.1);
			precioFactura +=factura.getPropina(); 
			
		}
	}

	

}
