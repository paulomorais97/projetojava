import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int genero;
		System.out.println("Digite seu genero...");
		System.out.println("Masculino = 1 | Feminino = 2 | Outros = 3");
		genero = ler.nextInt();
		
		System.out.println(  (genero == 1)? "\nSeu genero � Masculino": (genero ==2)?"\nSeu genero � Feminino":(genero ==3)?"\nSeu genero � Outro":"\nN�mero Inv�lido");
		
		
		ler.close();
	}

}
