public class Exercicios1 {

    public static void main(String[] args) {
        Exercicios1 exercicio = new Exercicios1();
        exercicio.exercicio1();


    }
    public void exercicio1(){
    int A = 10;
    int B = 20;
    int sup = A;
    System.out.printf("%nValor inicial da variavel A: %d%n%n",A);
    System.out.printf("%nValor inicial da variavel B: %d%n%n",B);

    A = B;
    B = sup;
    System.out.printf("%nValor final da variavel A: %d%n%n",A);
    System.out.printf("%nValor final da variavel B: %d%n%n",B);

    }
}