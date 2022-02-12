package br.com.dio.iocharacter;

import java.io.*;

public class Exercicio1IOCharater {

    public static void main(String[] args) throws IOException {

        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line.isBlank()));

        bw.flush();

        br.close();
        bw.close();
    }
}
