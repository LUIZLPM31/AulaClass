//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("av juca Batista");
        endereco.setNumero(1234);
        System.out.println(endereco.getRua());

        Cliente cliente = new Cliente( "Luiz", 12345678,endereco);
        System.out.println(cliente.toString());

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luiz");
        funcionario.setCpf(12345678);
        funcionario.setSalario(1000);
        funcionario.setEndereco(endereco);
        System.out.println(funcionario.toString());
        


        



    }
}