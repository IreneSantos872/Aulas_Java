package br.com.dio.iocharacter;

import java.io.*;

/*
Faça uma cópia do arquivo "recomendacoes.txt e agora adicione 3 recomendações de livros.
 */
public class Exercicio3IOCharacter {

    public static void copiarArquivo() throws IOException {
        File f = new File("C:/Aulas-Java/recomendacoes.txt");
        String nameArquivo = f.getName();

     //   FileReader r = new FileReader(nameArquivo);
     //   BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine();

        String nameArquivoCopy = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nameArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while(!(line == null));

        System.out.printf("\nArquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes", f.getName(), f.length());
        System.out.printf("\nArquivo \"%s\" copiado com sucesso!  Com o tamanho '%d' bytes", fcopy.getName(), fcopy.length());



        PrintWriter pw = new PrintWriter(System.out);
        pw.println("\nRecomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        pw.printf("\nOK! Tudo certo. Tamanho do arquivo '%d' bytes", f.length());
        bw.close();
        br.close();
        pw.close();


    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while(!(line.equalsIgnoreCase("fim")));

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();

    }
}
