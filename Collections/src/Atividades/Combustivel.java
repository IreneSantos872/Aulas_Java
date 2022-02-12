package Atividades;

import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Combustivel {

        public static void main(String[] args)  throws IOException {
            int combustivel,stop=1;
            int soma1=0, soma2=0, soma3=0;

            Scanner sc = new Scanner(System.in);


            while(stop != 2){
                if (stop == 1){
                    System.out.println("Informe um numero:");
                    combustivel = sc.nextInt();

                    if (combustivel == 1){
                        soma1 = soma1 + 1;
                    }
                    else if (combustivel == 2){
                        soma2 = soma2 + 1;
                    }
                    else if (combustivel == 3){
                        soma3 = soma3 + 1;
                    }
                    else if (combustivel == 4){
                        System.out.println("Fim");
                        stop = 2;
                        break;
                    }
                    else {
                        System.out.println("Por gentileza informe um codigo de 1 a 4:");
                    }
                }

                }
            if (stop == 2){
                System.out.println("MUITO OBRIGADO");
                System.out.printf("Alcool: %d\n",soma1);
                System.out.printf("Gasolina: %d\n",soma2);
                System.out.printf("Diesel: %d\n",soma3);
            }
            sc.close();
        }

}
