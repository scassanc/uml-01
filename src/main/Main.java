package main;

public class Main {
  public static void main(String[] args) {
    Pedido pedido = new Pedido(1);
    Producto teclado = new Producto("Teclado", 25.5);
    Producto raton = new Producto("Ratón", 15.0);

    pedido.agregarProducto(teclado);
    pedido.agregarProducto(raton);

    System.out.printf("Número de pedido: %d\n", pedido.getNumero());
    System.out.printf("Estado del pedido: %s\n", pedido.getEstado());
    System.out.printf("Total del pedido: %f\n", pedido.calcularTotal());

    pedido.setEstado(EstadoPedido.ENVIADO);

    System.out.printf("Estado del pedido: %s\n", pedido.getEstado());

    // 1. ¿Qué tipo de relación se define en el diagrama UML entre `Pedido`
    // y `Producto`?
    // Es una composición.

    // 2. ¿Qué significa la cardinalidad indicada en esa relación?
    // Un pedido puede tener cero o muchos productos, y un producto solo puede
    // pertenecer a un pedido

    // 3. ¿Qué otros tipos de cardinalidad se pueden definir en UML?
    // - (1..1): Uno a uno - Por ejemplo el perfil de un usuario, donde solo
    // pertenece ese perfil a un único usuario
    // - (0..1): Opcional - Cuando un objeto puede o no pertenecer a otro, cómo la
    // categoría de un producto, que puede no estar definida
    // - (*..*): Muchos a muchos - Productos y pedidos (no este ejemplo) en el que
    // un pedido puede tener muchos productos y los productos pueden pertenecer a
    // varios pedidos

    // 4. ¿Qué diferencias existen entre una asociación, una agregación y una
    // composición?
  }
}
