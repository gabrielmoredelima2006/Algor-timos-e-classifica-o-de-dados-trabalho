import java.util.ArrayList;
import java.util.Scanner;

public class TesteHierarquia 
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<veiculo> listaDeVeiculos = new ArrayList<>();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- MENU DE VEÍCULOS ---");
            System.out.println("1 - Adicionar Veículo Comum");
            System.out.println("2 - Adicionar Caminhão (Truck)");
            System.out.println("3 - Adicionar Jipe (Off-Road)");
            System.out.println("4 - Listar todos os veículos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("\n-- Cadastro de Veículo Comum --");
                System.out.print("Digite o número de passageiros: ");
                int pass = entrada.nextInt();
                System.out.print("Digite a capacidade de combustível (galões): ");
                int fuel = entrada.nextInt();
                System.out.print("Digite o consumo (mpg): ");
                int mpg = entrada.nextInt();
                listaDeVeiculos.add(new veiculo(pass, fuel, mpg));
                System.out.println("Veículo comum salvo na lista!");
                
            } else if (opcao == 2) {
                System.out.println("\n-- Cadastro de Caminhão --");
                System.out.print("Digite o número de passageiros: ");
                int pass = entrada.nextInt();
                System.out.print("Digite a capacidade de combustível (galões): ");
                int fuel = entrada.nextInt();
                System.out.print("Digite o consumo (mpg): ");
                int mpg = entrada.nextInt();
                System.out.print("Digite a capacidade de carga (kg): ");
                int carga = entrada.nextInt();
                listaDeVeiculos.add(new Truck(pass, fuel, mpg, carga));
                System.out.println("Caminhão salvo na lista!");
                
            } else if (opcao == 3) {
                System.out.println("\n-- Cadastro de Jipe (Off-Road) --");
                System.out.print("Digite o número de passageiros: ");
                int pass = entrada.nextInt();
                System.out.print("Digite a capacidade de combustível (galões): ");
                int fuel = entrada.nextInt();
                System.out.print("Digite o consumo (mpg): ");
                int mpg = entrada.nextInt();
                System.out.print("Digite a distância do solo (cm): ");
                int solo = entrada.nextInt();
                listaDeVeiculos.add(new OffRoad(pass, fuel, mpg, solo));
                System.out.println("Off-Road salvo na lista!");
                
            } else if (opcao == 4) {
                System.out.println("\n--- VEÍCULOS CADASTRADOS ---");
                if (listaDeVeiculos.isEmpty()) {
                    System.out.println("Nenhum veículo cadastrado ainda.");
                } else {
                    for (veiculo v : listaDeVeiculos) 
                    {
                        System.out.println(v.toString());
                    }
                }
                
            } else if (opcao != 5) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        
        System.out.println("Sistema encerrado.");
        entrada.close();
    }
}