import java.util.Scanner;

public class Exercicios2 {

    public static void main(String[] args) {
            Exercicios2 exercicio = new Exercicios2();
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira uma letra de a até f:");
            String letra = sc.next();
            if (letra.equals ("a")){
            exercicio.exercicio2a();
            }
            if (letra.equals ("b")){
                exercicio.exercicio2b();
            }
             if (letra.equals ("c")){exercicio.exercicio2c();
            }
             if (letra.equals ("d")){
                exercicio.exercicio2d();
            }
             if (letra.equals ("e")){
                exercicio.exercicio2e();
             }
              if (letra.equals ("f")){
                exercicio.exercicio2f();
              }
              sc.close();
    }
    public void exercicio2a(){
        int A = 10;
        int B = 20;
        System.out.println("");
        System.out.println("Exercicio 2 (a)");
        System.out.println("");
        System.out.printf("Valor inicial variável b: %d %n", B);
        B = 5;
        System.out.printf("Valor final variável a: %d %nValor final vari\u00E1vel b: %d %n", A, B);

    }
    public void exercicio2b(){
        int A = 30;
        int B = 20;
        int C = A + B;
        System.out.println("");
        System.out.println("Exercicio 2 (b)");
        System.out.println("");
        System.out.printf("Valor inicial variável c: %d %n", C);
        B = 10;
        System.out.printf("Valor intermediário variável B: %d %nValor intermediário vari\u00E1vel C: %d %n", B, C);
        C = A + B;
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %nValor final vari\u00E1vel C: %d %n", A, B, C);
    }
    public void exercicio2c(){
        int A = 10;
        int B = 20;
        int C = A;
        B = C;
        A = B;
        System.out.println("");
        System.out.println("Exercicio 2 (c)");
        System.out.println("");
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %nValor final vari\u00E1vel C: %d %n", A, B, C);
    }
    public void exercicio2d(){
        System.out.println("");
        System.out.println("Exercicio 2 (d)");
        System.out.println("");
        int A = 10;
        int B = (A+1);
        A = (B+1);
        B = (A+1);
        System.out.printf("Valor intermediário variável A: %d %n", A);
        A = (B+1);
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %n", A, B);
    }
    public void exercicio2e(){
        System.out.println("");
        System.out.println("Exercicio 2 (e)");
        System.out.println("");
        int A = 10;
        int B = 5;
        int C = A + B;
        B = 20;
        C = 10;
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %nValor final vari\u00E1vel C: %d %n", A, B, C);
    
    }
    public void exercicio2f(){
    System.out.println("");
    System.out.println("Exercicio 2 (f)");
    System.out.println("");
    int X = 1;
    int Y = 2;
    int Z = Y - X;
    System.out.printf("Valor intermediário variável Z: %d %n", Z);
    X = 5;
    Y = X + Z;
    System.out.printf("Valor final variável X: %d %nValor final vari\u00E1vel Y: %d %nValor final vari\u00E1vel Z: %d %n", X, Y, Z);
    
    }
}