package Atividades;

import java.util.Scanner;

public class DivisaoInteiro {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        int x = inp.nextInt();

        System.out.println("Informe o segundo numero:");
        int y = inp.nextInt();

        System.out.println(x);
        System.out.println(y);

         for(int i = x; i < y; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.print(i + " ");
                x++;
            }
        }
//


    }
}
