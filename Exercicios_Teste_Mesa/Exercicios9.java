import java.util.Scanner;

public class Exercicios9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o salário atual: ");
        double atual = sc.nextDouble();
        System.out.println("Insira a porcentagem de reajuste: ");
        double porcentagem;
        porcentagem = sc.nextDouble();
        System.out.printf("%nSalário reajustado: %.2f %n%n", (atual+(atual*porcentagem/100)));
        sc.close();
    }
}