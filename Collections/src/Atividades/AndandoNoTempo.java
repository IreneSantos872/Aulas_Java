package Atividades;

import java.util.Scanner;

public class AndandoNoTempo {

    public static void main(String[] args) {
        System.out.println("Digite a qtde de anos para sua viagem: ");
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int anoatual = 2022;

        if(a + b == c || a + c == b || b + c == a || a == b || b == c || a == c){
            System.out.println("S");}
        else{
            System.out.println("N");
        }

//        System.out.println("Escolhe sua viagem: \n" +
//                "1 - Futuro\n " +
//                "2 - Passado\n" +
//                "3 - Fim");
//        int viagem = leitor.nextInt();
//        switch (viagem):
//        case 1:
//            return anoatual + a;

    }
}
