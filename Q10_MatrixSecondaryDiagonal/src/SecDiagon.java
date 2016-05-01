import java.util.Scanner;
import java.util.Arrays;

public class SecDiagon {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double[][] matrix = new double[3][3];
		double sum = 0;
		int j = matrix[1].length;
		
		for (int i=0;i<matrix[0].length; i++)
			for (int k=0; k < matrix[1].length ; k++)
				matrix[i][k] = input.nextDouble() ;

		
		for (int i=0;i<matrix[0].length; i++){
			j--;
			sum += matrix[i][j];
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println("The Secondary Diagonal Sum is:" + sum);		
	}
	
}
