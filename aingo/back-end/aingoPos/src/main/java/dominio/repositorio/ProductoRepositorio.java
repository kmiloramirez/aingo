package dominio.repositorio;

import dominio.Producto;

import java.util.List;

public interface ProductoRepositorio {
    public void agregarProducto(Producto producto);
    public Producto obtenerProduto (int codigo);
    public List<Producto> obtenerListaProductos ();
}
