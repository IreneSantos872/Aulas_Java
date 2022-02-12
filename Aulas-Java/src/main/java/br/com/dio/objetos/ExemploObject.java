package br.com.dio.objetos;

import java.io.*;

public class ExemploObject {

    public static void serealizacao() throws IOException {

        Gato gato =new Gato("Simba", 6, "amarelado", true, false);
        File f = new File("gato");

     //   OutputStream os = new FileOutputStream(f.getName());
     //   ObjectOutputStream oos = new ObjectOutputStream(os);

        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes", f.getName(), f.length());

        oos.close();
        ps.close();
    }

    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {

     //   InputStream is = new FileInputStream(arquivo);
     //   ObjectInputStream ois = new ObjectInputStream(is);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetogato = (Gato) ois.readObject();

        System.out.printf("\n Nome .........: %s", objetogato.getNome());
        System.out.printf("\n Idade .........: %d", objetogato.getIdade());
        System.out.printf("\n Cor .........: %s", objetogato.getCor());
        System.out.printf("\n Castrado .........: %s", objetogato.isCastrado());
        System.out.printf("\n Ronrona .........: %s\n", objetogato.isRonrona());
        System.out.println(objetogato);

        ois.close();


    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
         //serealizacao();
        desserializacao("C:/Aulas-Java/gato");
    }
}
