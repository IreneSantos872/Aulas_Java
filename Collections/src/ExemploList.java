import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Antonio");
        nomes.add("Pedro");
        nomes.add("Marcos");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //Altera elemento da lista na posição 2
        nomes.set(2, "Larissa");

        // Organizar em ordem alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);
        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int posicao = nomes.indexOf("Pedro");
        System.out.println("Posição: " + posicao);

        int tamanho = nomes.size();
        System.out.println("Tamanho do array: " + tamanho);

        //lista os nome da Lista pelo for
        for(String nomeDoItem : nomes ){
            System.out.println("--->" + nomes);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("--->" + iterator.next());
        }

        boolean temAntonio = nomes.contains("Antonio");
        System.out.println(temAntonio);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        List<String> lista2 = new ArrayList<>();
        lista2.add("Ismael");
        lista2.add("Rodrigo");


        boolean listaEstaVazia =nomes.isEmpty();
        System.out.println(listaEstaVazia);

        //limpa a lista
        nomes.clear();
        System.out.println(nomes);



    }
}
