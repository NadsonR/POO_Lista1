import java.util.Scanner;

public class TestSquare {
	
	public static void main(String[] args){
		// inicialization patterns
		double lado = 1; //default
		Scanner input = new Scanner(System.in);
		//
		
		do{
			System.out.println("Digite o tamanho do lado de seu quadrado:");
			lado = input.nextDouble();
			if (lado>20 || lado<1){
				System.out.println("Erro!!Por favor, digite um tamanho entre 1 e 20.");
			}
		}
		while (lado>20 || lado<1);
		Square quadrado = new Square();
		quadrado.BuildingSq(lado);

		
		
	}

}
