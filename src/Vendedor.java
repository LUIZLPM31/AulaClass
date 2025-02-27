import java.util.List;

public class Vendedor extends Funcionario {
    private List<Venda> vendas;

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public double receberComissao() {
        return 0; 
    }

    @Override
    public String toString() {
        return "\n" +
               "Nome: " + getNome() + "\n" +
               "Cpf: " + getCpf() + "\n" +
               "Salário: " + getSalario() + "\n" +
               "\nEndereço: " + getEndereco() + "\n" +
               "\nContatos: " + getContatos() + "\n" +
               "Vendas: " + vendas;
    }
}
