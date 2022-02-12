package poo;

import model.Cliente;
import model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "00000000";
        // dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente
        if(cliente.getEnderecos() == null){
            cliente.setEnderecos() = new ArrayList<Endereco>();
        }

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereço:" + e.getMessage());
        }

    }
}
