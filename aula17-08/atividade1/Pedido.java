public class Pedido {

    Cliente cliente;
    Produto produto;
    int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void resumo() {
        double valorTotal = produto.preco * quantidade;

        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Valor total: R$ " + valorTotal);
    }

    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            produto.preco = produto.preco - (produto.preco * percentual / 100);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }
}