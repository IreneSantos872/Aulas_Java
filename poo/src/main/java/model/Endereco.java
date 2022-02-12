package model;

public class Endereco {

    public enum TipoEndereco{
        Residencial, Entrega, Trabalho
    }

    private String endereco;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;
    public String cep;

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
