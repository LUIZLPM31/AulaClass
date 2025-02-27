public class Gerente extends Funcionario {

    public void mudarSalario(Funcionario funcionario, double novoSalario) {
        funcionario.setSalario(novoSalario); 
    }

    public void demitir(Funcionario funcionario) {
        
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
