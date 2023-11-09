package atvjava;

import java.util.Scanner;

public class AtvJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float N1, N2, N3, N4, Diferenca;
		
		Scanner scanner = new Scanner (System.in);
		
        System.out.println("Digite o valor do Número 1: ");
        N1 = scanner.nextFloat();
        
        System.out.println("Digite o valor do Número 2: ");
        N2 = scanner.nextFloat();
        
        System.out.println("Digite o valor do Número 3: ");
        N3 = scanner.nextFloat();
        
        System.out.println("Digite o valor do Número 4: ");
        N4 = scanner.nextFloat();
		
        Diferenca = (N1 * N2) - (N3 * N4);

		System.out.println("A media das notas é:" + Diferenca);
		
		scanner.close();
	}

}
