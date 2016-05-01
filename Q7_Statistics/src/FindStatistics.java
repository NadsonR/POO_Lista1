import java.util.Arrays;

public final class FindStatistics {
	
	public static int  Mode(int[] numbers ){
	    
		boolean aux1 = true;
				int	a=0, 
					b=0, 
					mode1=0, 
					mode2=0;
		
		Arrays.sort(numbers);
		
		for (int i=1; i<numbers.length; i++){
		
			if (numbers[i-1] == numbers[i] && aux1){
				a += 1;
				mode1 = numbers[i-1];
			}
			else if (numbers[i-1] == numbers[i] && aux1 == false){
				b += 1;
				mode2 = numbers[i-1];
			}
			else if (numbers[i-1] != numbers[i]){
				if (a>b){
					b =0;
					aux1 = false;
				}
				else if (b>a){
					a = 0;
					aux1 = true;
				}
			}
		}
		if (a>b)
			System.out.println("A moda eh "+mode1);
		else if (b>a)
			System.out.println("A moda eh "+mode2);
		else
			System.out.println("As modas sao "+ mode1 +" e "+ mode2);
		return 0;
	}
	
	public static int Median(int[] numbers){
		
		int tami = numbers.length;
		double median = 0;
		
		if (tami%2 == 0){
			median = (numbers[tami/2-1]+numbers[tami/2])/2;
			System.out.println("A mediana eh "+ median);
		}
		else{
			median = numbers[(int) (tami/2)];
			System.out.println("A mediana eh "+ median);			
		}		
		return 0;
	}
	
	public static int Mean(int[] numbers){
		
		int sum = 0;
		
		for (int c: numbers){
			sum += c;
		}
		float mean = (float) sum/numbers.length;
		
		System.out.println("A media eh: "+ mean);
		
		return 0;
	}
	
	
}
