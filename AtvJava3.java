package atvjava;

import java.util.Scanner;

public class AtvJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float SalarioBruto, AdNoturno, HorasExtras, Descontos;
		float SalarioLiquido;
		
		Scanner scanner = new Scanner (System.in);
		
        System.out.println("Digite o valor do Salário Bruto: ");
        SalarioBruto = scanner.nextFloat();
        
        System.out.println("Digite o valor do Adicional Nortuno: ");
        AdNoturno = scanner.nextFloat();
        
        System.out.println("Digite o valor das Horas Extras: ");
        HorasExtras = scanner.nextFloat();
        
        System.out.println("Digite o valor dos Descontos do Colaborador: ");
        Descontos = scanner.nextFloat();
		
        SalarioLiquido = SalarioBruto + AdNoturno + (HorasExtras * 5) - Descontos;

		System.out.println("O valor do Salário Liquido é:" + SalarioLiquido);
		
		scanner.close();
	}

}