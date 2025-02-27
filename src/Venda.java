import java.util.List;

public class Venda {
    private long codigo;
    private String dataVenda;
    private Vendedor vendedor; // Fixed variable declaration
    private List<Produto> produtos;

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularVenda() {
        return 0; // Placeholder for sale calculation implementation
    }

    @Override
    public String toString() {
        return "\n" +
               "Código: " + codigo + "\n" +
               "Data de venda: " + dataVenda + "\n" +
               "Vendedor: " + vendedor + "\n" +
               "Produtos: " + produtos + "\n"; // Removed the extra comma
    }
}
