package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated me9thod stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		double mediaEscolar;
		
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO");

		System.out.print("Digite o nome do aluno[a]: ");
		aluno1.nomeAluno = ler.nextLine().toUpperCase();
		System.out.print("\n[M] - Masculino | [F] - Feminino \nDigite o sexo do aluno[a]: ");
		aluno1.sexoAluno = ler.next().toUpperCase().charAt(0);
		System.out.print("\nDigite a turma do aluno[a]: ");
		aluno1.turmaAluno = ler.next().toUpperCase().charAt(0);
		
		System.out.print("\nDigite o ano de nascimento do aluno[a]: ");
		aluno1.anoNascimento = ler.nextInt();
		
		System.out.print("\nDigite a média da escola: ");
		mediaEscolar = ler.nextDouble();
		for(int i=0;i<4;i++) {
			System.out.printf("\nDigite a %dº nota: ", i+1);
			aluno1.notas[i] = ler.nextDouble();
		}
				
		
		
		aluno1.mostrar();
		aluno1.mostrarIdade();		
		aluno1.mediaAluno();
		aluno1.mostrarMedia(mediaEscolar);
		
		
		ler.close();
	}

}
