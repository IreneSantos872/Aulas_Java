package model;

import java.util.List;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHA_CNPJ = 14;

    public enum TipoPessoa{FISICA, JURIDICA}

    public Integer id;
    public String nome;
    public String documento;
    public TipoPessoa tipo;

    public String getDocumento{
        return documento;
    }

    public void setDocumento(String documento){
        if(documento=-null||documento.isEmpty()){
        throw new RuntimeException("Documento não pode ser nulo ou vazio")
        }

        if(documento.length() == TAMANHO_CPF ){
            setDocumento(documento, tipo = TipoPessoa.FISICA);
        } else if(documento.length() == TAMANHA_CNPJ){
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);

        }
        else{
            throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");
        }

    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    private void setDocumento(String documento, TipoPessoa tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }
}
