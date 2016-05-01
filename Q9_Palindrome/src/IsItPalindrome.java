import java.util.Arrays;
import java.util.Scanner;

public class IsItPalindrome {

	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite uma palavra palindroma: ");
		String palavra = input.nextLine();
		
		char[] str1 = palavra.toCharArray();
		boolean palindrome = true;
		int j = str1.length;
		
		for (int i=0; i<str1.length; i++){
				j--;	
				System.out.println("[ "+str1[i]+" , "+str1[j]+" ]");
				if (str1[i] != str1[j]){
					palindrome = false;
				}
		}
		if (palindrome)
			System.out.println("Eh palindromo!");
		else
			System.out.println("Nao eh palindromo!");
	}
}
