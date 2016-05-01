
public class Triangle{

	static final int equilatero = 3;
	static final int isosceles = 2;
	static final int escaleno = 1;
	static final int nenhumtrian = 0;
	
	
	private double ladoA = 0 , ladoB = 0, ladoC = 0;
	
	
	public Triangle(double ladoA, double ladoB, double ladoC) {

		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public int TypeTriangle(){
		int trian;
		
		if (ladoA < ladoB+ladoC && ladoB < ladoA+ladoC && ladoC < ladoA+ladoB){
		
			if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC ){
				trian = equilatero;
			}
			else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
				trian = isosceles;
			}
			else{
				trian = escaleno;
			}
		}
		else {
				trian = nenhumtrian;
		}
		return trian;
	}
	public void Answer(int trian){

		switch (trian){
	
		case equilatero :
			System.out.println("É um Triângulo Equilatero!");
			break;
		case isosceles :
			System.out.println("É um Triângulo Isosceles!");
			break;
		case escaleno :
			System.out.println("É um Triângulo Escaleno!");
			break;
		case nenhumtrian: 
			System.out.println("Isso não é um triângulo!");
			break;
	
		}//switch
	}//Answer
}

