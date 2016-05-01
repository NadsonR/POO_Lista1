import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			double[] array1 = new double[10];
			
			for (int i=0; i<array1.length;i++){
				System.out.println("The the number" + i + " : ");
				array1[i] = input.nextDouble();
			}
			System.out.println(Arrays.toString(array1));
			Arrays.sort(array1);
			System.out.println(Arrays.toString(array1));
	}
}
