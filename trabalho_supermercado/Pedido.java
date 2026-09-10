import java.util.ArrayList;
public class Pedido 
{
    private Cliente cliente;
    private ArrayList<Item> itens;
    private TipoPagamento pagamento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularTotalItem();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("\n--- Resumo do Pedido ---");
        System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        for (Item item : itens) {
            System.out.println("- " + item.getQuantidade() + "x " + item.getProduto().getDescricao() + " | Subtotal: R$ " + item.calcularTotalItem());
        }
        System.out.println("Total a pagar: R$ " + calcularTotalPedido());
        if (pagamento != null) {
            System.out.println("Forma de Pagamento: " + pagamento);
        }
    }
}