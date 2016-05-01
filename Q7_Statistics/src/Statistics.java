import java.util.Scanner;
import java.util.Arrays;

public class Statistics {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite quantos elementos voce deseja no vetor:");
		int numElement = input.nextInt();
		
		int[] vectror = new int[numElement];
		
		for (int i = 0; i<numElement; i++){
			System.out.println("Numb posicao "+i+" do vetor:");
			vectror[i] = input.nextInt();
		}
		
		FindStatistics.Mode(vectror);
		FindStatistics.Median(vectror);
		FindStatistics.Mean(vectror);
	}
}
