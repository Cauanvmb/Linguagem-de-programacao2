import java.util.Scanner;
public class Exercicios10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o custo de fábrica do carro: ");
        Double inicial = sc.nextDouble();
        double distribuidor = inicial*0.28;
        double imposto = inicial*0.45;
        System.out.printf("O custo final do carro é de R$%.2f %n%n", (inicial+distribuidor+imposto));
        sc.close();
        }
}