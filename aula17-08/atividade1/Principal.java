public class Principal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria", "maria@email.com");
        Cliente cliente2 = new Cliente("João", "joao@email.com");

        Produto produto1 = new Produto("Notebook", 3000.00);
        Produto produto2 = new Produto("Mouse", 100.00);

        Pedido pedido1 = new Pedido(cliente1, produto1, 1);
        Pedido pedido2 = new Pedido(cliente2, produto2, 2);

        System.out.println("=== PEDIDO 1 ===");
        pedido1.resumo();

        System.out.println();

        System.out.println("=== PEDIDO 2 ===");
        pedido2.resumo();

        System.out.println();

        System.out.println("=== PEDIDO 1 COM DESCONTO ===");
        pedido1.aplicarDesconto(10);
        pedido1.resumo();
    }
}