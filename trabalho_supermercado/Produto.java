public class Produto 
{
    private Descricao descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(Descricao descricao, double preco, int quantidadeEstoque) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public Descricao getDescricao() {
        return descricao;
    }
    
    public int getQuantidadeEstoque() 
    {
        return quantidadeEstoque;
    }
    public void reduzirEstoque(int quantidade) 
    {
        if (quantidade <= this.quantidadeEstoque) 
        {
            this.quantidadeEstoque -= quantidade;
        } else 
        {
            System.out.println("Estoque insuficiente para " + descricao);
        }
    }
}