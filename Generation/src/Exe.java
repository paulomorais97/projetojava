import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		int x, y, aux;
		
		System.out.print("Digite o valor de X: ");
		x = ler.nextInt();
		System.out.print("Digite o valor de Y: ");
		y = ler.nextInt();
		
	    	aux=y;
	    	y=x;
	    	x=aux;
	    	
		System.out.println("-------------------------------");
		System.out.println("Valor de X: "+x+" | Valor de Y: "+y);
	}

}
