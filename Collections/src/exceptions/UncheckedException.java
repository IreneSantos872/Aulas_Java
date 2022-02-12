package exceptions;

import javax.swing.*;
// Fazer a divisão por numero inteiro

public class UncheckedException {

    public static void main(String[] args){

        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro: "+ e.getMessage());
                //e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossivel dividir um numero por zero "+ e.getMessage());
            }
            finally {
                System.out.println("Chegou ao finally!");
            }


        } while (continueLooping);


        System.out.println("O código continua");

    }

    private static int dividir(int a, int b) {
            return a / b;

    }
}
