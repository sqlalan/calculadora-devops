public class Main {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double a = 20;
        double b = 5;

        System.out.println("=== Calculadora DevOps ===");
        System.out.println("Valores: a = " + a + ", b = " + b);
        System.out.println("Soma: " + soma(a, b));
        System.out.println("Subtração: " + subtracao(a, b));
        System.out.println("Multiplicação: " + multiplicacao(a, b));
        System.out.println("Divisão: " + dividir(a, b));

        try {
            dividir(a, 0);
        } catch (ArithmeticException e) {
            System.out.println("Teste divisão por zero: " + e.getMessage());
        }

        System.out.println("Pipeline executada com sucesso!");
    }
}
