import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) throws IOException{
			
			Scanner input = new Scanner(System.in);
			while(true){
				
				
				System.out.println("Digite o primeiro valor da operacao:");
				float num1 = input.nextFloat();
				
				System.out.println("Digite o operador:");
				char operador = (char)System.in.read();
				
				System.out.println("Digite o segundo valor da operacao:");
				float num2 = input.nextFloat();
				
	
				switch (operador){
				
				case '+' :
					num1 = num1 +num2;
					System.out.println("Ans = "+num1);
					break;
				case '-' :
					num1 = num1 - num2;
					System.out.println("Ans = "+num1);					
					break;
				case '*' :
					num1 = num1 * num2;
					System.out.println("Ans = "+num1);
					break;
				case '/' :
					if (num2 == 0){
						System.out.println("Erro! Voce esta tentando dividir por ZERO.");
						break;	
					}
					num1 = num1 / num2;
					System.out.println("Ans = "+num1);
					break;
				default:
					System.out.println("Erro! Operador nao existe!");
				}//end switch
			}//endwhile
	}//endmain

}//endclass
