import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adiciona 4 esporte no vector
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);
        //Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        System.out.println(esportes);
        //Remove o esporte da posição 2
        esportes.remove(2);

        //Remove o esporte Handebol
        esportes.remove("Handebol");
        System.out.println(esportes);

        //Retorna o primeiro item do valor
        System.out.println("Primeiro da lista:" + esportes.get(0));

        //Navega nos esportes
        for(String esporte : esportes){
            System.out.println(esporte);
        }

    }
}
