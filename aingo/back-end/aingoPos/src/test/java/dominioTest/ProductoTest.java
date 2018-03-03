package dominioTest;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Producto;

public class ProductoTest {
	
	@Test
	public void crearProducto() {
		Producto producto = new Producto(4,"sal");
		assertTrue(producto.getCodigo()==4);
		assertTrue(producto.getNombre().equals("sal"));
	}
	
	
}
