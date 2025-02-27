public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private Venda venda;

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "\n" +
               "Nome: " + nome + "\n" +
               "Descrição: " + descricao + "\n" +
               "Valor: " + valor + "\n"; // Removed the extra comma
    }

}
