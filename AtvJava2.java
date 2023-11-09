package atvjava;

import java.util.Scanner;

public class AtvJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Nota1, Nota2, Nota3, Nota4, Media;
		
		Scanner scanner = new Scanner (System.in);
		
        System.out.println("Digite o valor da Nota 1: ");
        Nota1 = scanner.nextFloat();
        
        System.out.println("Digite o valor da Nota 2: ");
        Nota2 = scanner.nextFloat();
        
        System.out.println("Digite o valor da Nota 3: ");
        Nota3 = scanner.nextFloat();
        
        System.out.println("Digite o valor da Nota 4: ");
        Nota4 = scanner.nextFloat();
		
		Media =  (Nota1 + Nota2 + Nota3 + Nota4) / 4;

		System.out.println("A media das notas é:" + Media);
		
		scanner.close();
	}

}
