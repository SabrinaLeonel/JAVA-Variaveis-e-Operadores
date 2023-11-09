package atvjava;
import java.util.Scanner;

public class AtvJava1 {

    public static void main(String[] args) {
        float Salario, Abono, NovoSalario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do Salario: ");
        Salario = scanner.nextFloat();
        
        System.out.println("Digite o valor do Abono: ");
        Abono = scanner.nextFloat();

        NovoSalario = Salario + Abono;
        
        System.out.println("O Novo Salário é: " + NovoSalario);

        scanner.close();
    }
}

