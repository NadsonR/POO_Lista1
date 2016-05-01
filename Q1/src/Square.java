import java.util.Scanner;

public class Square {
	
/*	private double ladoSq = 0;
	
	public Square(double ladoSq) {

		this.ladoSq = ladoSq;
	}
*/	
	public void BuildingSq(double ladoSq){

		for (int i = 0; i < ladoSq; i++ ){
			
			String addHere = ""; 
			
			for (int j = 0; j < ladoSq; j++ ){
				addHere = addHere.concat("* ");
			}
			System.out.println(addHere);
		}
	}
	
}
