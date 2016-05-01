import java.util.Scanner;

public class CheckPerfectInt {
	
	public boolean IsItAPerfectInt(int IntNumb){
		boolean yesItIs;
		int adder=0;
		for (int i=1; i<IntNumb; i++){
			int remainder = IntNumb%i;
			if (remainder == 0){
				adder += i;
			}
		}
		if (adder == IntNumb){
			yesItIs = true;
			return yesItIs;
		}
		else{
			yesItIs = false;
			return yesItIs;
		}
		
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.println("Digite um numero inteiro positivo:");
			int numero = input.nextInt();
			if (numero<0){
				System.out.println("Numero negativo, digite novamente!");
			}
			else{
				CheckPerfectInt teste = new CheckPerfectInt();
				boolean truth = teste.IsItAPerfectInt(numero);
				System.out.println(truth);
				if (truth){
					System.out.println("Eh perfeito!");
				}
				else{
					System.out.println("Nao eh perfeito!");
				}
			}
		}

	
	}
}
