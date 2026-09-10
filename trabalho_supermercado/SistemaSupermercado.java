import java.util.Scanner;

public class SistemaSupermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto pArroz = new Produto(Descricao.ARROZ, 25.50, 100);
        Produto pFeijao = new Produto(Descricao.FEIJAO, 8.90, 50);
        
        Pedido pedidoAtual = null;
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU DO SUPERMERCADO ===");
            System.out.println("1) Novo pedido");
            System.out.println("2) Realizar pagamento");
            System.out.println("0) Sair da aplicação");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o CPF do cliente: ");
                String cpf = scanner.nextLine();
                Cliente cliente = new Cliente(nome, cpf);
                pedidoAtual = new Pedido(cliente);
                System.out.println("Adicionando 2 pacotes de Arroz e 1 de Feijão ao pedido...");
                pedidoAtual.adicionarItem(new Item(pArroz, 2));
                pedidoAtual.adicionarItem(new Item(pFeijao, 1));
                System.out.println("Pedido criado com sucesso!");
            } else if (opcao == 2) {
                if (pedidoAtual == null) {
                    System.out.println("Nenhum pedido em andamento. Crie um novo pedido primeiro.");
                } else {
                    System.out.println("O total do pedido é: R$ " + pedidoAtual.calcularTotalPedido());
                    System.out.println("Formas de pagamento: 1-DINHEIRO, 2-CHEQUE, 3-CARTAO");
                    System.out.print("Escolha a forma (1-3): ");
                    int forma = scanner.nextInt();
                    if (forma == 1) pedidoAtual.setPagamento(TipoPagamento.DINHEIRO);
                    else if (forma == 2) pedidoAtual.setPagamento(TipoPagamento.CHEQUE);
                    else if (forma == 3) pedidoAtual.setPagamento(TipoPagamento.CARTAO);
                    pedidoAtual.exibirResumo();
                    pedidoAtual = null;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        }
        System.out.println("Aplicação encerrada.");
        scanner.close();
    }
}