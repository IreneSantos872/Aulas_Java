package Atividades;

import java.util.Scanner;

public class NumeroInteiros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[5];
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for(int i = 0; i < n.length; i++){
            System.out.println("Digite 1 numero inteiro: ");
            n[i] = scan.nextInt();

            if(n[i] % 2 == 0 )
                par++;
            else
                impar++;

            if(n[i] >= 0)
                positivo++;
            else
                negativo++;

        }
            System.out.println(par + " valor(es) par(es)");
            System.out.println(impar + " valor(es) impar(es)");
            System.out.println(positivo + " valor(es) positivo(s)");
            System.out.println(negativo + " valor(es) negativo(s)");

    }
}
