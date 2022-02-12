package exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {

    public static void main(String[] args) {
        String nomeDoArquivo = "C://Users//irene//dio//Collections//romane.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que vc deseja imprimir " + e.getCause());
            //    e.printStackTrace();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado! Entre em contato com o suporte " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou ao fim");
        }
        System.out.println("Apesar da exception ou não, o programa continua...");

    }

    public static void imprimirArquivoNoConsole(String nomedoArquivo) throws IOException {
        File file = new File(nomedoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line= br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }

    public static BufferedReader lerArquivo(String nomedoArquivo) throws FileNotFoundException {
        File file = new File(nomedoArquivo);

        final BufferedReader bufferedReader = new BufferedReader(new FileReader(nomedoArquivo));
        return bufferedReader;
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String message, String nomeDoArquivo, String diretorio) {
        super(message);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}