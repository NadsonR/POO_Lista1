import java.util.Scanner;

public class CortaDiretorio {

	public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			int j = 0;
			String corte = null;
			System.out.println("Digite o endereco do arquivo:");
			String diretorio = input.nextLine();
			
			j = diretorio.lastIndexOf('\\');
			corte = diretorio.substring(j+1);
			System.out.println("O nome do arquivo eh: \n " + corte);

	}
	
}