package br.com.dio.iodata;

import java.io.*;
import java.util.Scanner;

public class ExemploIOData {

    public static void incluirProduto() throws IOException {

        File f = new File("c:/java aula/peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

      //  OutputStream os = new FileOutputStream(f.getPath());
      //  DataOutputStream dos = new DataOutputStream(os);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.print("Nome da peça: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da peça (P/M/G/U): ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quant = scan.nextInt();
        dos.writeInt(quant);

        ps.print("Preço unitario: ");
        Double preco = scan.nextDouble();
        dos.writeDouble(preco);


        ps.printf("O arquivo %s foi criado com %d bytes no diretório '%s'", f.getName(), f.length(), f.getAbsoluteFile());

        lerProduto(f.getPath());

        dos.close();
        scan.close();
        ps.getClass();

    }

    public static void lerProduto(String arquivo) throws IOException {
        File f = new File(arquivo);

     //   InputStream is = new FileInputStream((f.getPath()));
    //    DataInputStream dis = new DataInputStream(is);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\n Nome .........: %s", nome);
        System.out.printf("\n Tamanho .........: %s",tamanho);
        System.out.printf("\n Quantidade .........: %s", quantidade);
        System.out.printf("\n Preço .........: %s", preco);
        System.out.print("\n Total valor das peças .........:" + (quantidade * preco));

        dis.close();

    }


    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
