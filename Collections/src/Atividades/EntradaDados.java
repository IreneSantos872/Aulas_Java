package Atividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

        public static void main(String[] args)  throws IOException {
            Scanner sc = new Scanner(System.in);

            int n, aux=0;
            System.out.println("Informe um numero:");
            n = sc.nextInt();

            for (int i = 0; i < n; i++){
                String texto = "PUM";
                int[] x = {aux+1,aux+2,aux+3};
                aux = aux + 4;
                System.out.println(x[0] + " " + x[1] + " " + x[2] + " " + texto);
        }
    }
}
