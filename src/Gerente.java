public class Gerente extends Funcionario {

    public void demitir(Funcionario funcionario) {
        // Implementar lógica de demissão
    }

    @Override
    public String toString() {
        return "\n" +
               "Nome: " + getNome() + "\n" +
               "Cpf: " + getCpf() + "\n" +
               "Salário: " + getSalario() + "\n" +
               "\nEndereço: " + getEndereco() + "\n" +
               "\nContato: " + getContatos();
    }
}
