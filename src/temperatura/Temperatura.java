package temperatura;

// Alt + shift + f = organiza todo o programa em arvore

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String tipo;
        double temp;
        System.out.print("Digite o tipo da comida: ");
        tipo = leitor.next();
        // tipo = tipo.toUpperCase();
        System.out.print("Digite a temperatura: ");
        temp = leitor.nextDouble();
        switch (tipo.toUpperCase()) {
            case "A":
                if (temp >= 10 && temp <= 17) {
                    System.out.println("Pode transportar!");
                } else {
                    System.out.println("Não pode transportar!");
                }
                break;
            case "B":
                if (temp >= 11 && temp <= 16) {
                    System.out.println("Pode transportar!");
                } else {
                    System.out.println("Não pode transportar!");
                }
                break;
            case "C":
                if (temp >= 12 && temp <= 15) {
                    System.out.println("Pode transportar!");
                } else {
                    System.out.println("Não pode transportar!");
                }
                break;
            case "D":
                if (temp >= 13 && temp <= 14) {
                    System.out.println("Pode transportar!");
                } else {
                    System.out.println("Não pode transportar!");
                }
                break;
        }
        System.out.println("Fim!");
    }
}
