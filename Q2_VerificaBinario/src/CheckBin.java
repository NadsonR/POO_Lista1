import java.util.Scanner;

public class CheckBin {

		public boolean IsItABin(int bin){
			boolean yesItIs = true;
			while (true){
				if (bin ==0){
					break;
				}
				else{
					int remainder = bin%10;
					if (remainder >1){
						yesItIs = false;
						break;
					}
				}
				bin = bin/10;
			}
			return yesItIs;
		}
		
		public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			while(true){
				System.out.println("Vamos checar se o numero eh binario. \n");
				System.out.println("Digite um numero:");
				int numero = input.nextInt();
				
				CheckBin teste = new CheckBin();
				
				boolean truth = teste.IsItABin(numero);
				if (truth){
					System.out.println("Eh binario!");
				}
				else{
					System.out.println("Nao eh binario!");
				}
			}
		}
}
