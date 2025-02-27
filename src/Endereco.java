public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;

    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return rua;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCep() {
        return cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return cidade;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getUf() {
        return uf;
    }
    public String toString() {
        return "\n" +
                "Rua: "+rua+"\n" +
                "Número: "+numero+"\n" +
                "Complemento: "+complemento+"\n" +
                "Bairro: "+bairro+"\n" +
                "Cep: "+cep+"\n" +
                "Cidade: "+cidade+"\n" +
                "UF: "+uf;
    }
}