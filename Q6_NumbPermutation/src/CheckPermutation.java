import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero A:");
		int A = input.nextInt();
		
		System.out.println("Digite um numero B:");
		int B = input.nextInt();
		
		// converts the given int number into string
		String strA = Integer.toString(A); 
		String strB = Integer.toString(B);
		//
		//creates arrays of characters of a given string
		char[] arrayA = strA.toCharArray();
		char[] arrayB = strB.toCharArray();
		//
		//create arrays of int numbers from 1 to 9 so that
		//the software is able to count them
		//
		int[] arrayIntA = new int[9];
		int[] arrayIntB = new int[9];
		int aux = 0;
		boolean permutation = true;
		
		for (char c: arrayA){ 				//Loop used to separate the char 
			if (c != '0'){					//values in its respective array
				aux = (int) c;				//positions. Example: if c = '1', 
			//	System.out.print(c);		//will increment the position 0 
				arrayIntA[aux-49]+= 1;		//of arrayIntAwhich regards to the 
			}								//quantity of number 1 at the split
		}									//number.
		
		//System.out.println("");
		for (char chau: arrayB){			// the same as the latest loop, but 
			if (chau != '0'){				// this time for arrayB
				aux = (int) chau;
			//	System.out.print(chau);
				arrayIntB[aux-49]+= 1;	
			}
		}
		System.out.println("");
		System.out.println(Arrays.toString(arrayIntA));
		System.out.println(Arrays.toString(arrayIntB));
		
		for (int i = 0; i>arrayIntA.length; i++){
			if (arrayIntA[i] != arrayIntB[i]){
				permutation = false;
			}
		}
		if (permutation)
			System.out.println("Se excluirmos os zeros, o numero A eh permutacao de B");
		else
			System.out.println("Nao eh permutacao!");
	
	}		
}
	