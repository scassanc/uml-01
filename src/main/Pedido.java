package main;

import java.util.ArrayList;

public class Pedido {
  private int numero;
  private EstadoPedido estado = EstadoPedido.PENDIENTE;
  private ArrayList<Producto> productos = new ArrayList<Producto>();

  public Pedido(int numero) {
    this.numero = numero;
  }

  public void agregarProducto(Producto p) {
    productos.add(p);
  }

  public double calcularTotal() {
    double total = 0;

    for (int i = 0; i < productos.size(); i++) {
      Producto p = productos.get(i);
      total += p.getPrecio();
    }

    return total;
  }

  public int getNumero() {
    return numero;
  }

  public EstadoPedido getEstado() {
    return estado;
  }

  public void setEstado(EstadoPedido estado) {
    this.estado = estado;
  }
}
