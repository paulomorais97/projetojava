package entidades;

public class Aluno {

	
	public String nomeAluno;
	public int anoNascimento;
	public char sexoAluno;
	public char turmaAluno;
	public double notas[] = new double[4];
	public double media;
	public double soma=0;
	public final int ANO_ATUAL = 2020;
	
	
	public void mostrar() {
		if(sexoAluno=='M') {
			System.out.println("\n-------------------------");
			System.out.print("\nNome do aluno: "+nomeAluno.toUpperCase());
			System.out.print("\nSexo do aluno: "+sexoAluno);
			System.out.print("\nTurma do aluno: "+turmaAluno);
		}
		else if (sexoAluno=='F'){
			System.out.println("\n-------------------------");
			System.out.print("\nNome da aluna: "+nomeAluno.toUpperCase());
			System.out.print("\nSexo da aluna: "+sexoAluno);
			System.out.print("\nTurma da aluna: "+turmaAluno);
		}
		
	
	}
	
	public void mostrarIdade() {
		System.out.print("\nIdade do aluno: "+(ANO_ATUAL-anoNascimento));
	}
	
	public double mediaAluno( ) {
		System.out.println("\n---Notas---");
		for(int i=0;i<notas.length;i++) {
			System.out.print((i+1)+"º nota: "+notas[i]+" |");
				soma+=notas[i];
		}
			media = soma/notas.length;
			System.out.print("\n--> Média do aluno: "+media);
		return media;
	}
	
	public void mostrarMedia(double mediaEscolar) {
		
		double media = this.media;
		if(media >= mediaEscolar) {
			System.out.println("\nAluno aprovado!!!");

			System.out.print("\nMédia da escola: "+mediaEscolar);
		}
		else {
			System.out.println("\nAluno reprovado pela média "+media);
			System.out.println("\nMédia da escola: "+mediaEscolar);
		}
	}
}
