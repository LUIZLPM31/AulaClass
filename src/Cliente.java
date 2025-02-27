public class Cliente{
    private String nome;
    private long cpf;
    private Endereco enderecos;

    public Cliente(String nome, long cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = endereco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    public long getCpf() {
        return cpf;
    }


    public void setEnderecos(Endereco enderecos){
        this.enderecos = enderecos;
    }
    public Endereco getEndereco(){
        return enderecos;
    }
    public String toString() {
        return "Cliente{" +
                "Nome: "+nome+"\n" +
                "Cpf: "+cpf+"\n" +
                "Endereço:"+enderecos +
                '}';
    }
}