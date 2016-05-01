import java.util.Scanner;

public class TestTriangle {
	public double ladoA = 0;
	public double ladoB = 0;
	public double ladoC = 0;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o comprimento do lado A:");
		double ladoA = input.nextDouble();
		
		System.out.println("Digite o comprimento do lado B:");
		double ladoB = input.nextDouble();
		
		System.out.println("Digite o comprimento do lado C:");
		double ladoC = input.nextDouble();	
		
		Triangle triangle = new Triangle(ladoA,ladoB,ladoC);

		System.out.println("Que tipo de triangulo é esse?");
		
		triangle.Answer( triangle.TypeTriangle() );
		
	}

}