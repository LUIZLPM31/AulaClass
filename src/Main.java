//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("av juca Batista");
        endereco.setNumero(1234);
        endereco.setComplemento("Casa");
        endereco.setBairro("Ipanema");
        endereco.setCep("22222222");
        endereco.setCidade("Porto Alegre");
        endereco.setUf("RS");
        System.out.println(endereco.toString());
        System.out.println("\n");

        Cliente cliente = new Cliente( "Luiz", 12345678,endereco);
        System.out.println(cliente.toString());
        System.out.println("\n");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Paulo");
        funcionario.setCpf(12345678);
        funcionario.setSalario(1000);
        funcionario.setEndereco(endereco);
        System.out.println(funcionario.toString());
        System.out.println("\n");
        
        Gerente gerente = new Gerente();
        gerente.setNome("Pedro");
        gerente.setCpf(12345678);
        gerente.setSalario(5000);
        System.out.println(gerente.toString());
        System.out.println("\n");

        gerente.mudarSalario(funcionario, 2000);
        System.out.println(funcionario.toString());
        System.out.println("\n");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("João");
        vendedor.setCpf(12345678);
        vendedor.setSalario(2000);
        System.out.println(vendedor.toString());
        System.out.println("\n");

        Venda venda = new Venda();
        venda.setCodigo(200);
        venda.setDataVenda("31/01/2023");
        venda.setVendedor(vendedor);
        venda.setProdutos(new ArrayList<Produto>());
        System.out.println(venda.toString());
        System.out.println("\n");

        Produto produto = new Produto();
        produto.setVenda(venda);
        produto.setNome("Sapato");
        produto.setValor(100);
        produto.setDescricao("Sapato de couro");
        System.out.println(produto.toString());
        System.out.println("\n");

        Contato contato = new Contato();
        contato.setTelefone("123456789");
        contato.setEmail("email@email.com");
        System.out.println(contato.toString());
        
      



        
        

        


        



    }
}