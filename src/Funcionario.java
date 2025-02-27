import java.util.List;

public class Funcionario {
    private String nome;
    private long cpf;
    private double salario;
    private Endereco endereco;
    private List<Contato> contatos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Contato> getContatos() { // Fixed type name
        return contatos;
    }

    public double calcularSalario() {
        return 0; // Placeholder for salary calculation implementation
    }

    public String toString() {
        return "\n" +
               "Nome: " + nome + "\n" +
               "Cpf: " + cpf + "\n" +
               "Salário: " + salario + "\n" +
               "\nEndereço: " + endereco + "\n" +
               "\nContatos: " + contatos; // Fixed output label
    }
}
